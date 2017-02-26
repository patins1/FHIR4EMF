package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionBinding;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionBindingRefElement")
public class ElementDefinitionBindingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionBinding createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionBinding();
	}
	
	public static ElementDefinitionBindingRef valueOf(String id) {
		ElementDefinitionBindingRef result = new ElementDefinitionBindingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}