package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentState;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentStateRefElement")
public class ConsentStateRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConsentState createInstance() {
		return FhirFactory.eINSTANCE.createConsentState();
	}
	
	public static ConsentStateRef valueOf(String id) {
		ConsentStateRef result = new ConsentStateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}