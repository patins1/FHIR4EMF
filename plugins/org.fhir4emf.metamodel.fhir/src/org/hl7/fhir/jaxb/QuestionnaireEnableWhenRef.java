package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireEnableWhen;

@XmlRootElement(name = "QuestionnaireEnableWhenRefElement")
public class QuestionnaireEnableWhenRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public QuestionnaireEnableWhen createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireEnableWhen();
	}
	
	public static QuestionnaireEnableWhenRef valueOf(String id) {
		QuestionnaireEnableWhenRef result = new QuestionnaireEnableWhenRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}