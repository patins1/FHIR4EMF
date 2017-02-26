package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentStatusRefElement")
public class ConsentStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConsentStatus createInstance() {
		return FhirFactory.eINSTANCE.createConsentStatus();
	}
	
	public static ConsentStatusRef valueOf(String id) {
		ConsentStatusRef result = new ConsentStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}