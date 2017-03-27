package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionDiscriminator;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionDiscriminatorRefElement")
public class ElementDefinitionDiscriminatorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionDiscriminator createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionDiscriminator();
	}
	
	public static ElementDefinitionDiscriminatorRef valueOf(String id) {
		ElementDefinitionDiscriminatorRef result = new ElementDefinitionDiscriminatorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}