package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimItemRefElement")
public class ClaimItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimItem createInstance() {
		return FhirFactory.eINSTANCE.createClaimItem();
	}
	
	public static ClaimItemRef valueOf(String id) {
		ClaimItemRef result = new ClaimItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}