package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityResponseBenefitBalance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityResponseBenefitBalanceRefElement")
public class EligibilityResponseBenefitBalanceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EligibilityResponseBenefitBalance createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityResponseBenefitBalance();
	}
	
	public static EligibilityResponseBenefitBalanceRef valueOf(String id) {
		EligibilityResponseBenefitBalanceRef result = new EligibilityResponseBenefitBalanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}