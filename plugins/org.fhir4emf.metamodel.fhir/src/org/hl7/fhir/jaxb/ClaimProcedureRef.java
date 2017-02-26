package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimProcedure;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimProcedureRefElement")
public class ClaimProcedureRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimProcedure createInstance() {
		return FhirFactory.eINSTANCE.createClaimProcedure();
	}
	
	public static ClaimProcedureRef valueOf(String id) {
		ClaimProcedureRef result = new ClaimProcedureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}