package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferralRequestStatus;

@XmlRootElement(name = "ReferralRequestStatusRefElement")
public class ReferralRequestStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ReferralRequestStatus createInstance() {
		return FhirFactory.eINSTANCE.createReferralRequestStatus();
	}
	
	public static ReferralRequestStatusRef valueOf(String id) {
		ReferralRequestStatusRef result = new ReferralRequestStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}