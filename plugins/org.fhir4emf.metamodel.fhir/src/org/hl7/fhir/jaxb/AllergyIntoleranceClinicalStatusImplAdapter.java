package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceClinicalStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceClinicalStatusList;
	
	
	
	

public class AllergyIntoleranceClinicalStatusImplAdapter extends XmlAdapter<String, AllergyIntoleranceClinicalStatus> {

	@Override
	public AllergyIntoleranceClinicalStatus unmarshal(String v) throws Exception {
		AllergyIntoleranceClinicalStatus result = FhirFactory.eINSTANCE.createAllergyIntoleranceClinicalStatus();
		result.setValue(AllergyIntoleranceClinicalStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceClinicalStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
