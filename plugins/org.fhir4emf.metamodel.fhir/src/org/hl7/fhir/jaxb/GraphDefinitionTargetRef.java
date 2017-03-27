package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphDefinitionTarget;

@XmlRootElement(name = "GraphDefinitionTargetRefElement")
public class GraphDefinitionTargetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GraphDefinitionTarget createInstance() {
		return FhirFactory.eINSTANCE.createGraphDefinitionTarget();
	}
	
	public static GraphDefinitionTargetRef valueOf(String id) {
		GraphDefinitionTargetRef result = new GraphDefinitionTargetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}