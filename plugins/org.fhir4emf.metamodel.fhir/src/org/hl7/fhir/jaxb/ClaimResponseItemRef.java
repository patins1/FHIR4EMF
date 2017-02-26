package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseItemRefElement")
public class ClaimResponseItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseItem createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseItem();
	}
	
	public static ClaimResponseItemRef valueOf(String id) {
		ClaimResponseItemRef result = new ClaimResponseItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}