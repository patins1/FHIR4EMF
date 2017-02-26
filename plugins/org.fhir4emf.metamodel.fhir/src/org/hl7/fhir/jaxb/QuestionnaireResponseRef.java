package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuestionnaireResponse;

@XmlRootElement(name = "QuestionnaireResponseRefElement")
public class QuestionnaireResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public QuestionnaireResponse createInstance() {
		return FhirFactory.eINSTANCE.createQuestionnaireResponse();
	}
	
	public static QuestionnaireResponseRef valueOf(String id) {
		QuestionnaireResponseRef result = new QuestionnaireResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}