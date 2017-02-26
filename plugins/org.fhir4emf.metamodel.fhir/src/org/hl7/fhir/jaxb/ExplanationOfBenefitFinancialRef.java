package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitFinancial;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitFinancialRefElement")
public class ExplanationOfBenefitFinancialRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitFinancial createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitFinancial();
	}
	
	public static ExplanationOfBenefitFinancialRef valueOf(String id) {
		ExplanationOfBenefitFinancialRef result = new ExplanationOfBenefitFinancialRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}