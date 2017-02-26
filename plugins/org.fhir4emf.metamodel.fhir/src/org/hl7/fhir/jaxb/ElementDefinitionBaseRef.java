package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionBase;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionBaseRefElement")
public class ElementDefinitionBaseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionBase createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionBase();
	}
	
	public static ElementDefinitionBaseRef valueOf(String id) {
		ElementDefinitionBaseRef result = new ElementDefinitionBaseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}