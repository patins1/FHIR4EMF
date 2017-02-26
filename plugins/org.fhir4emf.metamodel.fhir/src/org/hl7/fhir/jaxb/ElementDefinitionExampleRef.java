package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionExample;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionExampleRefElement")
public class ElementDefinitionExampleRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionExample createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionExample();
	}
	
	public static ElementDefinitionExampleRef valueOf(String id) {
		ElementDefinitionExampleRef result = new ElementDefinitionExampleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}