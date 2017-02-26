package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireResponseStatus;

@XmlRootElement(name = "QuestionnaireResponseStatusRefElement")
public class QuestionnaireResponseStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public QuestionnaireResponseStatus createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireResponseStatus();
	}
	
	public static QuestionnaireResponseStatusRef valueOf(String id) {
		QuestionnaireResponseStatusRef result = new QuestionnaireResponseStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}