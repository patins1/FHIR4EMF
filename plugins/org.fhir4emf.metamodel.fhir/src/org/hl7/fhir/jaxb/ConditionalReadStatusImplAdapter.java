package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConditionalReadStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConditionalReadStatusList;
	
	
	
	

public class ConditionalReadStatusImplAdapter extends XmlAdapter<String, ConditionalReadStatus> {

	@Override
	public ConditionalReadStatus unmarshal(String v) throws Exception {
		ConditionalReadStatus result = FhirFactory.eINSTANCE.createConditionalReadStatus();
		result.setValue(ConditionalReadStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ConditionalReadStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
