var RAASCMSURL = "fhirrest";
var baseURL = RAASCMSURL + "?servicehandler=fhirrest&request=";

var startRestRequest;

var classInstances = {};

var app = angular.module('myApp', []);

app.directive('bindFile', [function () {
    return {
        require: "ngModel",
        restrict: 'A',
        link: function ($scope, el, attrs, ngModel) {
            el.bind('change', function (event) {
                ngModel.$setViewValue(event.target.files[0]);
                $scope.$apply();
            });

            $scope.$watch(function () {
                return ngModel.$viewValue;
            }, function (value) {
                if (!value) {
                    el.val("");
                }
            });
        }
    };
}]);

app.controller('myCtrl', function($scope) {
    $scope.trafoResult = {javaText:'(empty)',csharpText:'(empty)',xpathText:'(empty)'};
    $scope.classNames = [""];
    $scope.packageURIs = ["Loading FHIR types from server.."];
    $scope.hasFormatInput=function (from) {
    	var pane = $("#pane"+from).scope();
    	return pane.FormatIsBinary() ? pane.data : pane.text; 
    };
});


app.controller('DataSource', function($scope) {
    $scope.FormatIsBinary=function () { 
    	return ["BSON","Avro","CBOR","Protobuf","SMILE"].includes($scope.format); 
    };
    $scope.clearInputs=function () { 
    	$scope.data = ""; 
    	$scope.text = "";
    };
});


$(function () {
	$('#packageDropDown').change(loadClassesForPackage);
	$('#classDropDown').change(loadDocument);		
	$('#formatDropDown').change(translateOCL);
		
});


function loadDocument(doAfterLoaded) {
	var docName = $("#classDropDown option:selected").text()
	if ($("#formatDropDown option:selected").text() != "RAASJSON") {
		translateOCL();
		return;
	}
	$("#ocl_text").val(JSON.stringify(classInstances[docName], null, 2));
}


function loadClassesForPackage(doAfterLoaded) {

		var type = $("#packageDropDown option:selected").text();
		type = type.substring(0,1).toLowerCase()+type.substring(1);
		performRESTRequest(
				"SearchRequest&_type=" + $("#packageDropDown option:selected").text(),
				function(data) {
					$scope=$('#appId').scope();
					$scope.classNames = data.result.entry.map( function (ti) { return ti.resource[type].id; } );
					data.result.entry.forEach( function (ti) {  classInstances[ti.resource[type].id] = ti.resource[type]; });
					$scope.$digest();
					if (typeof  doAfterLoaded == "function") doAfterLoaded();
					$('#classDropDown').val("");
					$('#ocl_text').val("");
				}
		);

}

function translateOCL() {
	
		performRESTRequest(
				"ReadRequest&_format=" + $("#formatDropDown option:selected").text()+"&type=" + $("#packageDropDown option:selected").text()+"&id=" + $("#classDropDown option:selected").text(),
				function(data) {  
					var content = data.content;
					if ( $("#formatDropDown option:selected").text() == "RAASJSON" ) {
						content = JSON.stringify(JSON.parse(content), null, 2);
					}					
					 $("#ocl_text").val(content);
				}
		);
		
}

function loadExample(type,id,format1,format2,_format) {
		if (!_format) _format = "ORIGINAL";
		performRESTRequest(
				"ReadRequest&_format="+_format+"&type="+type+"&id="+id,
				function(data) {
					var pane1 = $("#pane1").scope();
					var pane2 = $("#pane2").scope();
					pane1.text = data.content;
					pane2.text = "";
					pane1.format = format1;
					pane2.format = format2;
					pane1.$parent.$digest();
				}
		);
		
}

function loadExample2(url,format1,format2) {

	beforeRequest();
	$.ajax({
		//  dataType: "json",
		  url: url}).done(
			function(data) {
				if (updateStatus(data)) {
					var pane1 = $("#pane1").scope();
					var pane2 = $("#pane2").scope();
					pane1.text = data;
					pane2.text = "";
					pane1.format = format1;
					pane2.format = format2;
					pane1.$parent.$digest();
				}

			}).fail(failFunction);		
	
};

function blobToFile(theBlob, fileName){
    //A Blob() is almost a File() - it's just missing the two properties below which we will add
    theBlob.lastModifiedDate = new Date();
    theBlob.name = fileName;
    return theBlob;
}

function transformFHIR(from,to) {
	
	beforeRequest();

	from = $("#pane"+from).scope();
	to = $("#pane"+to).scope();

	var endpoint = baseURL + "TransformRequest&inputFormat=" + from.format + "&outputFormat=" + to.format;
	
//	if (to.FormatIsBinary()) {
//		postByFORM(endpoint, {"content" : from.text});
//		return;
//	}

	var formData = new FormData();
	if (from.FormatIsBinary()) {
		formData.append("binaryContent", from.data);
	} else {
		formData.append("content", from.text);
	}
	

	// see http://stackoverflow.com/questions/16086162/handle-file-download-from-ajax-post#answer-23797348
	// jQuery mangles the binary data!	
	var xhr = new XMLHttpRequest();
	xhr.open('POST', endpoint, true);
	if (to.FormatIsBinary()) xhr.responseType = 'arraybuffer';
	xhr.onload = function () {
	    if (this.status === 200 && to.FormatIsBinary()) {
	        var filename = "";
	        var disposition = xhr.getResponseHeader('Content-Disposition');
	        if (disposition && disposition.indexOf('attachment') !== -1) {
	            var filenameRegex = /filename[^;=\n]*=((['"]).*?\2|[^;\n]*)/;
	            var matches = filenameRegex.exec(disposition);
	            if (matches != null && matches[1]) filename = matches[1].replace(/['"]/g, '');
	        }
	        var type = xhr.getResponseHeader('Content-Type');

	        var blob = new Blob([this.response], { type: type });
	        if (typeof window.navigator.msSaveBlob !== 'undefined') {
	            // IE workaround for "HTML7007: One or more blob URLs were revoked by closing the blob for which they were created. These URLs will no longer resolve as the data backing the URL has been freed."
	            window.navigator.msSaveBlob(blob, filename);
	        } else {
	            var URL = window.URL || window.webkitURL;
	            var downloadUrl = URL.createObjectURL(blob);

	            if (filename) {
	                // use HTML5 a[download] attribute to specify filename
	                var a = document.createElement("a");
	                // safari doesn't support this yet
	                if (typeof a.download === 'undefined') {
	                    window.location = downloadUrl;
	                } else {
	                    a.href = downloadUrl;
	                    a.download = filename;
	                    document.body.appendChild(a);
	                    a.click();
	                    // store resulting file, however input[file] UI is not updated correspondingly 
	                    var file = blobToFile(blob);
	                    to.data = file;
	                    to.$parent.$digest();
	                }
	            } else {
	                window.location = downloadUrl;
	            }

	            setTimeout(function () { URL.revokeObjectURL(downloadUrl); }, 100); // cleanup
	        }
	    } else {
	    	var str = "";
	    	if (to.FormatIsBinary()) {
		        var arr = new Uint8Array(xhr.response);
		        str = String.fromCharCode.apply(String, arr);
	    	} else {
	    		str = xhr.responseText;
	    	}
	    	
	        var data = JSON.parse(str);

			if (updateStatus(data)) {
				var content = data.content;
				if ( to.format == "JSON" ) {
					content = JSON.stringify(JSON.parse(content), null, 2);
				}					
				to.text = content;
				to.$parent.$digest();
			}

	    }
	};
	//xhr.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
	xhr.send(formData);
	
}


function updateStatus(data) {
	if (data.errorMessage) {
		$("#status").html("Error message from server: " + data.errorMessage);
		$("#status").css('color', 'red');
		return false;
	} else {
		$("#status").html(
				"Request processed in "
						+ (new Date().getTime() - startRestRequest) + "ms");
		$("#status").css('color', 'green');
		return true;
	}
}

function failFunction( jqXHR, textStatus, errorThrown) {
	$("#status").html("Server request failed: "+jqXHR.status+ " " + jqXHR.statusText +(jqXHR.responseJSON?': '+jqXHR.responseJSON.errorMessage:'') );
	$("#status").css('color', 'red');
}

function beforeRequest() {
	startRestRequest = new Date().getTime();
	$("#status").html("Waiting for response...");
	$("#status").css('color', 'gray');
}

function performRESTRequest(urlSuffix, success) {
	beforeRequest();
	$.getJSON(baseURL + urlSuffix).done(
			function(data) {
				if (updateStatus(data) && success)
					success(data);
			}).fail(failFunction);

}