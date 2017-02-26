package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitAdjudication;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitAdjudicationRefElement")
public class ExplanationOfBenefitAdjudicationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitAdjudication createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitAdjudication();
	}
	
	public static ExplanationOfBenefitAdjudicationRef valueOf(String id) {
		ExplanationOfBenefitAdjudicationRef result = new ExplanationOfBenefitAdjudicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}