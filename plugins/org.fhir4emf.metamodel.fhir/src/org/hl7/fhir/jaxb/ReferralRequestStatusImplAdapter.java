package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferralRequestStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ReferralRequestStatusList;
	
	
	
	

public class ReferralRequestStatusImplAdapter extends XmlAdapter<String, ReferralRequestStatus> {

	@Override
	public ReferralRequestStatus unmarshal(String v) throws Exception {
		ReferralRequestStatus result = FhirFactory.eINSTANCE.createReferralRequestStatus();
		result.setValue(ReferralRequestStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ReferralRequestStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
