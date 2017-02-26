package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConditionalDeleteStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConditionalDeleteStatusList;
	
	
	
	

public class ConditionalDeleteStatusImplAdapter extends XmlAdapter<String, ConditionalDeleteStatus> {

	@Override
	public ConditionalDeleteStatus unmarshal(String v) throws Exception {
		ConditionalDeleteStatus result = FhirFactory.eINSTANCE.createConditionalDeleteStatus();
		result.setValue(ConditionalDeleteStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ConditionalDeleteStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
