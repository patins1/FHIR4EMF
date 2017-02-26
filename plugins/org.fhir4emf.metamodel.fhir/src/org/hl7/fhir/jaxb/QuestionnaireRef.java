package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Questionnaire;

@XmlRootElement(name = "QuestionnaireRefElement")
public class QuestionnaireRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Questionnaire createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaire();
	}
	
	public static QuestionnaireRef valueOf(String id) {
		QuestionnaireRef result = new QuestionnaireRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}