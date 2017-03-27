package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConditionClinicalStatusCodes;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConditionClinicalStatusCodesList;
	
	
	
	

public class ConditionClinicalStatusCodesImplAdapter extends XmlAdapter<String, ConditionClinicalStatusCodes> {

	@Override
	public ConditionClinicalStatusCodes unmarshal(String v) throws Exception {
		ConditionClinicalStatusCodes result = FhirFactory.eINSTANCE.createConditionClinicalStatusCodes();
		result.setValue(ConditionClinicalStatusCodesList.get(v));
		return result;
	}

	@Override
	public String marshal(ConditionClinicalStatusCodes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
