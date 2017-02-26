package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimInsurance;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimInsuranceRefElement")
public class ClaimInsuranceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimInsurance createInstance() {
		return FhirFactory.eINSTANCE.createClaimInsurance();
	}
	
	public static ClaimInsuranceRef valueOf(String id) {
		ClaimInsuranceRef result = new ClaimInsuranceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}