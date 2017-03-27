package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConfidentialityClassification;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConfidentialityClassificationList;
	
	
	
	

public class ConfidentialityClassificationImplAdapter extends XmlAdapter<String, ConfidentialityClassification> {

	@Override
	public ConfidentialityClassification unmarshal(String v) throws Exception {
		ConfidentialityClassification result = FhirFactory.eINSTANCE.createConfidentialityClassification();
		result.setValue(ConfidentialityClassificationList.get(v));
		return result;
	}

	@Override
	public String marshal(ConfidentialityClassification v) throws Exception {
		return v.getValue().getLiteral();
	}

}
