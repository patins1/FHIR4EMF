package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferralRequestRequester;

@XmlRootElement(name = "ReferralRequestRequesterRefElement")
public class ReferralRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ReferralRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createReferralRequestRequester();
	}
	
	public static ReferralRequestRequesterRef valueOf(String id) {
		ReferralRequestRequesterRef result = new ReferralRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}