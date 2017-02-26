package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.QuestionnaireStatusList;
	
	
	
	

public class QuestionnaireStatusImplAdapter extends XmlAdapter<String, QuestionnaireStatus> {

	@Override
	public QuestionnaireStatus unmarshal(String v) throws Exception {
		QuestionnaireStatus result = FhirFactory.eINSTANCE.createQuestionnaireStatus();
		result.setValue(QuestionnaireStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(QuestionnaireStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
