var RAASCMSURL = "fhirrest";
var baseURL = RAASCMSURL + "?servicehandler=fhirrest&request=";

var startRestRequest;

var classInstances = {};

function unflatten(prefix,nodes,elements) {
	for (let element of elements) {
		if (element.path.substring(0,prefix.length) == prefix && element.path.indexOf(".",prefix.length)==-1) {
			var node = {"title": element.path.substring(prefix.length), "element":element, "nodes":[]};
			nodes.push(node);
			unflatten(element.path+".",node.nodes,elements);
		}
	}
}

function flatten(nodes,elements) {
	for (let node of nodes) {
		if ($.inArray(node.element,elements)!=-1) {
			console.log(node);
			alert("already contained:"+node.element.path);
		}
		elements.push(node.element);
		flatten(node.nodes,elements);
	}
}

function loadStructureDefinition(scope,structureDefinition) {

	var nodes = [];
	unflatten("",nodes,structureDefinition.snapshot.element)
	
	var elements = [];
	flatten(nodes,elements);
	for (let element of structureDefinition.snapshot.element) {
		if ($.inArray(element,elements)==-1) {
			console.log(element);
			alert("At leasted one element (see console) is not processed: "+element.path);
		}
	}
	console.log(structureDefinition.snapshot.element);
//	alert(structureDefinition.snapshot.element.length+"!="+elements.length + "unflattening doesn't work, check console!");
//	if (structureDefinition.snapshot.element.length!=elements.length) {
//		console.log(structureDefinition);
//		console.log(nodes);
//		console.log(elements);
//		alert(structureDefinition.snapshot.element.length+"!="+elements.length + "unflattening doesn't work, check console!");
//	}
	
//	console.log(structureDefinition);
	scope.data =  nodes;
	scope.$digest();
}

var app = angular.module('myApp', ['ui.tree', 'ui.bootstrap']);

app.controller('myCtrl', ['$scope', function ($scope) {

	

	$scope.loadExample = function (scope,type,id,_format) {
			if (!_format) _format = "ORIGINAL";
			performRESTRequest(
					"ReadRequest&_format="+_format+"&type="+type+"&id="+id,
					function(data) {
						loadStructureDefinition(scope, JSON.parse(data.content));
					}
			);
			
	};
	
	$scope.loadExample2 = function (scope,url) {

		beforeRequest();
		$.getJSON(url).done(
				function(data) {
					if (updateStatus(data)) {
						loadStructureDefinition(scope,data);
					}

				}).fail(failFunction);		
		
	};
	
	$scope.remove = function (scope) {
      scope.remove();
    };

    $scope.toggle = function (scope) {
      scope.toggle();
    };

    $scope.moveLastToTheBeginning = function () {
      var a = $scope.data.pop();
      $scope.data.splice(0, 0, a);
    };

    $scope.newSubItem = function (scope) {
      var nodeData = scope.$modelValue;
      nodeData.nodes.push({
        id: nodeData.id * 10 + nodeData.nodes.length,
        title: nodeData.title + '.' + (nodeData.nodes.length + 1),
        nodes: []
      });
    };

    $scope.collapseAll = function () {
      $scope.$broadcast('angular-ui-tree:collapse-all');
    };

    $scope.expandAll = function () {
      $scope.$broadcast('angular-ui-tree:expand-all');
    };

    $scope.data = [{
      'id': 1,
      'title': 'node1',
      'nodes': [
        {
          'id': 11,
          'title': 'node1.1',
          'nodes': [
            {
              'id': 111,
              'title': 'node1.1.1',
              'nodes': []
            }
          ]
        },
        {
          'id': 12,
          'title': 'node1.2',
          'nodes': []
        }
      ]
    }, {
      'id': 2,
      'title': 'node2',
      'nodrop': true, // An arbitrary property to check in custom template for nodrop-enabled
      'nodes': [
        {
          'id': 21,
          'title': 'node2.1',
          'nodes': []
        },
        {
          'id': 22,
          'title': 'node2.2',
          'nodes': []
        }
      ]
    }, {
      'id': 3,
      'title': 'node3',
      'nodes': [
        {
          'id': 31,
          'title': 'node3.1',
          'nodes': []
        }
      ]
    }];
  }]);


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

$(function() { 
	var scope = $("#appId").scope();
//	scope.loadExample2(scope,'?servicehandler=downloadServiceHandler&artifact=plugin/org.fhir4emf.rest/WebContent/examples/diagnosticreport-example.json'); 
	scope.loadExample2(scope,'?servicehandler=downloadServiceHandler&artifact=plugin/org.fhir4emf.rest/WebContent/examples/MyQuestionnaire.structuredefinition.json'); 
//	scope.loadExample(scope,'StructureDefinition','examplestu2','RAASJSON'); 
});