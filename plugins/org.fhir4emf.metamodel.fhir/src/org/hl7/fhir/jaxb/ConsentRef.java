package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Consent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentRefElement")
public class ConsentRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Consent createInstance() {
		return FhirFactory.eINSTANCE.createConsent();
	}
	
	public static ConsentRef valueOf(String id) {
		ConsentRef result = new ConsentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}