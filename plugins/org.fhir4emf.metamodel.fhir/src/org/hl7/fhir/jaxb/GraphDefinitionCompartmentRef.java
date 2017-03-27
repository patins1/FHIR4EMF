package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GraphDefinitionCompartment;

@XmlRootElement(name = "GraphDefinitionCompartmentRefElement")
public class GraphDefinitionCompartmentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GraphDefinitionCompartment createInstance() {
		return FhirFactory.eINSTANCE.createGraphDefinitionCompartment();
	}
	
	public static GraphDefinitionCompartmentRef valueOf(String id) {
		GraphDefinitionCompartmentRef result = new GraphDefinitionCompartmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}