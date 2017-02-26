package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseDetail1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseDetail1RefElement")
public class ClaimResponseDetail1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseDetail1 createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseDetail1();
	}
	
	public static ClaimResponseDetail1Ref valueOf(String id) {
		ClaimResponseDetail1Ref result = new ClaimResponseDetail1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}