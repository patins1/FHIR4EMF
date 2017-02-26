package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompartmentDefinition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompartmentDefinitionRefElement")
public class CompartmentDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CompartmentDefinition createInstance() {
		return FhirFactory.eINSTANCE.createCompartmentDefinition();
	}
	
	public static CompartmentDefinitionRef valueOf(String id) {
		CompartmentDefinitionRef result = new CompartmentDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}