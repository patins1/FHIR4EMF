package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ClaimDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimDetailRefElement")
public class ClaimDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ClaimDetail createInstance() {
		return FhirFactory.eINSTANCE.createClaimDetail();
	}
	
	public static ClaimDetailRef valueOf(String id) {
		ClaimDetailRef result = new ClaimDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}