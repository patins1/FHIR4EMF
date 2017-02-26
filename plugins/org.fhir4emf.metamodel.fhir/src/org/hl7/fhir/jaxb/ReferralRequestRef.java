package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferralRequest;

@XmlRootElement(name = "ReferralRequestRefElement")
public class ReferralRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ReferralRequest createInstance() {
		return FhirFactory.eINSTANCE.createReferralRequest();
	}
	
	public static ReferralRequestRef valueOf(String id) {
		ReferralRequestRef result = new ReferralRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}