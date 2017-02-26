package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionMapping;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionMappingRefElement")
public class ElementDefinitionMappingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionMapping createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionMapping();
	}
	
	public static ElementDefinitionMappingRef valueOf(String id) {
		ElementDefinitionMappingRef result = new ElementDefinitionMappingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}