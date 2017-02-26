package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Claim;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ClaimRefElement")
public class ClaimRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Claim createInstance() {
		return FhirFactory.eINSTANCE.createClaim();
	}
	
	public static ClaimRef valueOf(String id) {
		ClaimRef result = new ClaimRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}