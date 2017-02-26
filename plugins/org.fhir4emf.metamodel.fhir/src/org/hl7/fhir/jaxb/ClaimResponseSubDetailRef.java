package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimResponseSubDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimResponseSubDetailRefElement")
public class ClaimResponseSubDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimResponseSubDetail createInstance() {
		return FhirFactory.eINSTANCE.createClaimResponseSubDetail();
	}
	
	public static ClaimResponseSubDetailRef valueOf(String id) {
		ClaimResponseSubDetailRef result = new ClaimResponseSubDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}