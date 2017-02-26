package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitInsurance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitInsuranceRefElement")
public class ExplanationOfBenefitInsuranceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitInsurance createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitInsurance();
	}
	
	public static ExplanationOfBenefitInsuranceRef valueOf(String id) {
		ExplanationOfBenefitInsuranceRef result = new ExplanationOfBenefitInsuranceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}