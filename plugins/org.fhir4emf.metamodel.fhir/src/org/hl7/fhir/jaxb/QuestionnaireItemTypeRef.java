package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireItemType;

@XmlRootElement(name = "QuestionnaireItemTypeRefElement")
public class QuestionnaireItemTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public QuestionnaireItemType createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireItemType();
	}
	
	public static QuestionnaireItemTypeRef valueOf(String id) {
		QuestionnaireItemTypeRef result = new QuestionnaireItemTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}