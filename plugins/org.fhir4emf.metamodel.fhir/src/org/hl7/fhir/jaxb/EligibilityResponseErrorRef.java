package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EligibilityResponseError;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EligibilityResponseErrorRefElement")
public class EligibilityResponseErrorRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EligibilityResponseError createInstance() {
		return FhirFactory.eINSTANCE.createEligibilityResponseError();
	}
	
	public static EligibilityResponseErrorRef valueOf(String id) {
		EligibilityResponseErrorRef result = new EligibilityResponseErrorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}