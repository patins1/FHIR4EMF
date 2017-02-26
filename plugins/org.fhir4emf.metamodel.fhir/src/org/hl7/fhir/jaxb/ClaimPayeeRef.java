package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimPayee;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimPayeeRefElement")
public class ClaimPayeeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimPayee createInstance() {
		return FhirFactory.eINSTANCE.createClaimPayee();
	}
	
	public static ClaimPayeeRef valueOf(String id) {
		ClaimPayeeRef result = new ClaimPayeeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}