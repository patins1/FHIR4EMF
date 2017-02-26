package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ReferenceHandlingPolicy;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ReferenceHandlingPolicyList;
	
	
	
	

public class ReferenceHandlingPolicyImplAdapter extends XmlAdapter<String, ReferenceHandlingPolicy> {

	@Override
	public ReferenceHandlingPolicy unmarshal(String v) throws Exception {
		ReferenceHandlingPolicy result = FhirFactory.eINSTANCE.createReferenceHandlingPolicy();
		result.setValue(ReferenceHandlingPolicyList.get(v));
		return result;
	}

	@Override
	public String marshal(ReferenceHandlingPolicy v) throws Exception {
		return v.getValue().getLiteral();
	}

}
