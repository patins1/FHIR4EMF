package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseError;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseErrorRefElement")
public class ClaimResponseErrorRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseError createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseError();
	}
	
	public static ClaimResponseErrorRef valueOf(String id) {
		ClaimResponseErrorRef result = new ClaimResponseErrorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}