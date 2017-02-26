package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityResponseInsurance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityResponseInsuranceRefElement")
public class EligibilityResponseInsuranceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EligibilityResponseInsurance createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityResponseInsurance();
	}
	
	public static EligibilityResponseInsuranceRef valueOf(String id) {
		EligibilityResponseInsuranceRef result = new EligibilityResponseInsuranceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}