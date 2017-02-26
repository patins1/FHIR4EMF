package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireOption;

@XmlRootElement(name = "QuestionnaireOptionRefElement")
public class QuestionnaireOptionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public QuestionnaireOption createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireOption();
	}
	
	public static QuestionnaireOptionRef valueOf(String id) {
		QuestionnaireOptionRef result = new QuestionnaireOptionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}