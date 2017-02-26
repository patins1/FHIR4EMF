package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionRefElement")
public class ElementDefinitionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinition createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinition();
	}
	
	public static ElementDefinitionRef valueOf(String id) {
		ElementDefinitionRef result = new ElementDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}