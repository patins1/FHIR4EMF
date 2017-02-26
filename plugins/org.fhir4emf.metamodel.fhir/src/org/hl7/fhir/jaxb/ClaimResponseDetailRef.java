package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseDetailRefElement")
public class ClaimResponseDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseDetail createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseDetail();
	}
	
	public static ClaimResponseDetailRef valueOf(String id) {
		ClaimResponseDetailRef result = new ClaimResponseDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}