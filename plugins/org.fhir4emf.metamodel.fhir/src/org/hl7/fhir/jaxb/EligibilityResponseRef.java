package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityResponseRefElement")
public class EligibilityResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public EligibilityResponse createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityResponse();
	}
	
	public static EligibilityResponseRef valueOf(String id) {
		EligibilityResponseRef result = new EligibilityResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}