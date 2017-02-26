package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimSubDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimSubDetailRefElement")
public class ClaimSubDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimSubDetail createInstance() {
		return FhirFactory.eINSTANCE.createClaimSubDetail();
	}
	
	public static ClaimSubDetailRef valueOf(String id) {
		ClaimSubDetailRef result = new ClaimSubDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}