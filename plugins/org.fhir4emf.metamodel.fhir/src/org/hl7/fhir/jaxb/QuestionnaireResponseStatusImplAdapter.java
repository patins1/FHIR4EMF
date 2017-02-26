package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireResponseStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.QuestionnaireResponseStatusList;
	
	
	
	

public class QuestionnaireResponseStatusImplAdapter extends XmlAdapter<String, QuestionnaireResponseStatus> {

	@Override
	public QuestionnaireResponseStatus unmarshal(String v) throws Exception {
		QuestionnaireResponseStatus result = FhirFactory.eINSTANCE.createQuestionnaireResponseStatus();
		result.setValue(QuestionnaireResponseStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(QuestionnaireResponseStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
