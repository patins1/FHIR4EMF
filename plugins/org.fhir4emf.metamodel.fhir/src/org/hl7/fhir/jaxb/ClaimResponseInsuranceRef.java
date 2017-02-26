package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseInsurance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseInsuranceRefElement")
public class ClaimResponseInsuranceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseInsurance createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseInsurance();
	}
	
	public static ClaimResponseInsuranceRef valueOf(String id) {
		ClaimResponseInsuranceRef result = new ClaimResponseInsuranceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}