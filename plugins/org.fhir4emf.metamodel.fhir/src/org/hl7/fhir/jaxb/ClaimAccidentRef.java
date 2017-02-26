package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimAccident;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimAccidentRefElement")
public class ClaimAccidentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimAccident createInstance() {
		return FhirFactory.eINSTANCE.createClaimAccident();
	}
	
	public static ClaimAccidentRef valueOf(String id) {
		ClaimAccidentRef result = new ClaimAccidentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}