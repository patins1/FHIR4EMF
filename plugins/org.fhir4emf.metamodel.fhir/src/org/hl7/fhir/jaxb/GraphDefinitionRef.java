package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphDefinition;

@XmlRootElement(name = "GraphDefinitionRefElement")
public class GraphDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public GraphDefinition createInstance() {
		return FhirFactory.eINSTANCE.createGraphDefinition();
	}
	
	public static GraphDefinitionRef valueOf(String id) {
		GraphDefinitionRef result = new GraphDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}