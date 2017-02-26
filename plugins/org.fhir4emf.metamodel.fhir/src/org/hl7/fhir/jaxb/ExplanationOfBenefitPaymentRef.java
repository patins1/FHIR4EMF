package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ExplanationOfBenefitPayment;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ExplanationOfBenefitPaymentRefElement")
public class ExplanationOfBenefitPaymentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ExplanationOfBenefitPayment createInstance() {
		return FhirFactory.eINSTANCE.createExplanationOfBenefitPayment();
	}
	
	public static ExplanationOfBenefitPaymentRef valueOf(String id) {
		ExplanationOfBenefitPaymentRef result = new ExplanationOfBenefitPaymentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}