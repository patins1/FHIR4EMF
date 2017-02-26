package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireResponseAnswer;

@XmlRootElement(name = "QuestionnaireResponseAnswerRefElement")
public class QuestionnaireResponseAnswerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public QuestionnaireResponseAnswer createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireResponseAnswer();
	}
	
	public static QuestionnaireResponseAnswerRef valueOf(String id) {
		QuestionnaireResponseAnswerRef result = new QuestionnaireResponseAnswerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}