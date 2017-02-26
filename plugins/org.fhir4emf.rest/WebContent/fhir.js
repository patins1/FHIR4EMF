var RAASCMSURL = "fhirrest";
var baseURL = RAASCMSURL + "?servicehandler=fhirrest&request=";

var startRestRequest;

var classInstances = {};

var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope) {
    $scope.trafoResult = {javaText:'(empty)',csharpText:'(empty)',xpathText:'(empty)'};
    $scope.classNames = [""];
    $scope.packageURIs = ["Loading FHIR types from server.."];
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

function loadExample(type,id,format1,format2) {
	
		performRESTRequest(
				"ReadRequest&_format=ORIGINAL&type="+type+"&id="+id,
				function(data) {
					 $("#text1").val(data.content);
					 $("#text2").val("");
					 $("#format1").val(format1);
					 $("#format2").val(format2);
				}
		);
		
}

function transformFHIR(from,to) {
	
	beforeRequest();

	var formData = new FormData();
	formData.append("content", $("#text"+from).val());
	
	$.ajax({
		url : baseURL + "TransformRequest&inputFormat=" + $("#format"+from+" option:selected").text()+"&outputFormat=" + $("#format"+to+" option:selected").text(),
		data : formData,
		cache : false,
		contentType : false,
		processData : false,
		type : 'POST',
		dataType : "json",
		success : function(data) {
			if (updateStatus(data)) {
				var content = data.content;
				if ( $("#format"+to+" option:selected").text() == "JSON" ) {
					content = JSON.stringify(JSON.parse(content), null, 2);
				}					
				$("#text"+to).val(content);
			}
		}
	}).fail(failFunction);
	
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