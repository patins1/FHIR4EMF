package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseAdjudication;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseAdjudicationRefElement")
public class ClaimResponseAdjudicationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseAdjudication createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseAdjudication();
	}
	
	public static ClaimResponseAdjudicationRef valueOf(String id) {
		ClaimResponseAdjudicationRef result = new ClaimResponseAdjudicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}