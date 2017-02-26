package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConditionVerificationStatusList;
	
	
	
	

public class ConditionVerificationStatusImplAdapter extends XmlAdapter<String, ConditionVerificationStatus> {

	@Override
	public ConditionVerificationStatus unmarshal(String v) throws Exception {
		ConditionVerificationStatus result = FhirFactory.eINSTANCE.createConditionVerificationStatus();
		result.setValue(ConditionVerificationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ConditionVerificationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
