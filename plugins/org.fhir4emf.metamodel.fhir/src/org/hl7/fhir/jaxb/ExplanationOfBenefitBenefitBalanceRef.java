package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitBenefitBalance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitBenefitBalanceRefElement")
public class ExplanationOfBenefitBenefitBalanceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitBenefitBalance createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitBenefitBalance();
	}
	
	public static ExplanationOfBenefitBenefitBalanceRef valueOf(String id) {
		ExplanationOfBenefitBenefitBalanceRef result = new ExplanationOfBenefitBenefitBalanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}