package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseProcessNote;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseProcessNoteRefElement")
public class ClaimResponseProcessNoteRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseProcessNote createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseProcessNote();
	}
	
	public static ClaimResponseProcessNoteRef valueOf(String id) {
		ClaimResponseProcessNoteRef result = new ClaimResponseProcessNoteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}