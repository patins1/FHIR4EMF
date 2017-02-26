package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireItem;

@XmlRootElement(name = "QuestionnaireItemRefElement")
public class QuestionnaireItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public QuestionnaireItem createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireItem();
	}
	
	public static QuestionnaireItemRef valueOf(String id) {
		QuestionnaireItemRef result = new QuestionnaireItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}