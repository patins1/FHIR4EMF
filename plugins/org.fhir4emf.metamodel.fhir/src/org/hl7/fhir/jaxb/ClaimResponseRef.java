package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseRefElement")
public class ClaimResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ClaimResponse createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponse();
	}
	
	public static ClaimResponseRef valueOf(String id) {
		ClaimResponseRef result = new ClaimResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}