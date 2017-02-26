package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubscriptionStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SubscriptionStatusList;
	
	
	
	

public class SubscriptionStatusImplAdapter extends XmlAdapter<String, SubscriptionStatus> {

	@Override
	public SubscriptionStatus unmarshal(String v) throws Exception {
		SubscriptionStatus result = FhirFactory.eINSTANCE.createSubscriptionStatus();
		result.setValue(SubscriptionStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SubscriptionStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
