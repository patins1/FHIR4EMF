package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimRelated;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimRelatedRefElement")
public class ClaimRelatedRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimRelated createInstance() {
		return FhirFactory.eINSTANCE.createClaimRelated();
	}
	
	public static ClaimRelatedRef valueOf(String id) {
		ClaimRelatedRef result = new ClaimRelatedRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}