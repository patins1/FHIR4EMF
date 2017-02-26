package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConsentDataMeaning;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConsentDataMeaningList;
	
	
	
	

public class ConsentDataMeaningImplAdapter extends XmlAdapter<String, ConsentDataMeaning> {

	@Override
	public ConsentDataMeaning unmarshal(String v) throws Exception {
		ConsentDataMeaning result = FhirFactory.eINSTANCE.createConsentDataMeaning();
		result.setValue(ConsentDataMeaningList.get(v));
		return result;
	}

	@Override
	public String marshal(ConsentDataMeaning v) throws Exception {
		return v.getValue().getLiteral();
	}

}
