package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubscriptionChannelType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SubscriptionChannelTypeList;
	
	
	
	

public class SubscriptionChannelTypeImplAdapter extends XmlAdapter<String, SubscriptionChannelType> {

	@Override
	public SubscriptionChannelType unmarshal(String v) throws Exception {
		SubscriptionChannelType result = FhirFactory.eINSTANCE.createSubscriptionChannelType();
		result.setValue(SubscriptionChannelTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(SubscriptionChannelType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
