package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentExceptType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentExceptTypeRefElement")
public class ConsentExceptTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConsentExceptType createInstance() {
		return FhirFactory.eINSTANCE.createConsentExceptType();
	}
	
	public static ConsentExceptTypeRef valueOf(String id) {
		ConsentExceptTypeRef result = new ConsentExceptTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}