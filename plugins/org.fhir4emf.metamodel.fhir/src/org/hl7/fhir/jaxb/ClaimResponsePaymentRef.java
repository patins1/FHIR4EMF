package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponsePayment;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponsePaymentRefElement")
public class ClaimResponsePaymentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponsePayment createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponsePayment();
	}
	
	public static ClaimResponsePaymentRef valueOf(String id) {
		ClaimResponsePaymentRef result = new ClaimResponsePaymentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}