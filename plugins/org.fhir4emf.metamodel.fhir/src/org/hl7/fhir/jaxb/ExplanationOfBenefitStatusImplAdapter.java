package org.hl7.fhir.jaxb;

import org.hl7.fhir.ExplanationOfBenefitStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ExplanationOfBenefitStatusList;
	
	
	
	

public class ExplanationOfBenefitStatusImplAdapter extends XmlAdapter<String, ExplanationOfBenefitStatus> {

	@Override
	public ExplanationOfBenefitStatus unmarshal(String v) throws Exception {
		ExplanationOfBenefitStatus result = FhirFactory.eINSTANCE.createExplanationOfBenefitStatus();
		result.setValue(ExplanationOfBenefitStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ExplanationOfBenefitStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
