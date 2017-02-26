package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConsentStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConsentStatusList;
	
	
	
	

public class ConsentStatusImplAdapter extends XmlAdapter<String, ConsentStatus> {

	@Override
	public ConsentStatus unmarshal(String v) throws Exception {
		ConsentStatus result = FhirFactory.eINSTANCE.createConsentStatus();
		result.setValue(ConsentStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ConsentStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
