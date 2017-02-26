package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireItemType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.QuestionnaireItemTypeList;
	
	
	
	

public class QuestionnaireItemTypeImplAdapter extends XmlAdapter<String, QuestionnaireItemType> {

	@Override
	public QuestionnaireItemType unmarshal(String v) throws Exception {
		QuestionnaireItemType result = FhirFactory.eINSTANCE.createQuestionnaireItemType();
		result.setValue(QuestionnaireItemTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(QuestionnaireItemType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
