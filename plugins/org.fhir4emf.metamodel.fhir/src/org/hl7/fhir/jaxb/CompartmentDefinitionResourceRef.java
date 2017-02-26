package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompartmentDefinitionResource;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompartmentDefinitionResourceRefElement")
public class CompartmentDefinitionResourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CompartmentDefinitionResource createInstance() {
		return FhirFactory.eINSTANCE.createCompartmentDefinitionResource();
	}
	
	public static CompartmentDefinitionResourceRef valueOf(String id) {
		CompartmentDefinitionResourceRef result = new CompartmentDefinitionResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}