package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionTypeRefElement")
public class ElementDefinitionTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionType createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionType();
	}
	
	public static ElementDefinitionTypeRef valueOf(String id) {
		ElementDefinitionTypeRef result = new ElementDefinitionTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}