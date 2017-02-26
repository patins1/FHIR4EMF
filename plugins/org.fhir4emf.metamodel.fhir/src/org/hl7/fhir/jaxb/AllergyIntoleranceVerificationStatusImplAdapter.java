package org.hl7.fhir.jaxb;

import org.hl7.fhir.AllergyIntoleranceVerificationStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AllergyIntoleranceVerificationStatusList;
	
	
	
	

public class AllergyIntoleranceVerificationStatusImplAdapter extends XmlAdapter<String, AllergyIntoleranceVerificationStatus> {

	@Override
	public AllergyIntoleranceVerificationStatus unmarshal(String v) throws Exception {
		AllergyIntoleranceVerificationStatus result = FhirFactory.eINSTANCE.createAllergyIntoleranceVerificationStatus();
		result.setValue(AllergyIntoleranceVerificationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(AllergyIntoleranceVerificationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
