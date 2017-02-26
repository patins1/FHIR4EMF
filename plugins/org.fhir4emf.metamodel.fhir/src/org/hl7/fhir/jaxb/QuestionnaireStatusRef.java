package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireStatus;

@XmlRootElement(name = "QuestionnaireStatusRefElement")
public class QuestionnaireStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public QuestionnaireStatus createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireStatus();
	}
	
	public static QuestionnaireStatusRef valueOf(String id) {
		QuestionnaireStatusRef result = new QuestionnaireStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}