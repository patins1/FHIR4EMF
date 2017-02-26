package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HealthcareServiceAvailableTime;

@XmlRootElement(name = "HealthcareServiceAvailableTimeRefElement")
public class HealthcareServiceAvailableTimeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public HealthcareServiceAvailableTime createInstance() {
		return FhirFactory.eINSTANCE.createHealthcareServiceAvailableTime();
	}
	
	public static HealthcareServiceAvailableTimeRef valueOf(String id) {
		HealthcareServiceAvailableTimeRef result = new HealthcareServiceAvailableTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}