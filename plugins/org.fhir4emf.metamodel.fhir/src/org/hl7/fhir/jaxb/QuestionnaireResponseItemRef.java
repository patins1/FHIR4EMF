package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireResponseItem;

@XmlRootElement(name = "QuestionnaireResponseItemRefElement")
public class QuestionnaireResponseItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public QuestionnaireResponseItem createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireResponseItem();
	}
	
	public static QuestionnaireResponseItemRef valueOf(String id) {
		QuestionnaireResponseItemRef result = new QuestionnaireResponseItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}