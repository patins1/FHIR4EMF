package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitProcessNote;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitProcessNoteRefElement")
public class ExplanationOfBenefitProcessNoteRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitProcessNote createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitProcessNote();
	}
	
	public static ExplanationOfBenefitProcessNoteRef valueOf(String id) {
		ExplanationOfBenefitProcessNoteRef result = new ExplanationOfBenefitProcessNoteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}