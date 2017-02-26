package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HealthcareService;

@XmlRootElement(name = "HealthcareServiceRefElement")
public class HealthcareServiceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public HealthcareService createInstance() {
		return FhirFactory.eINSTANCE.createHealthcareService();
	}
	
	public static HealthcareServiceRef valueOf(String id) {
		HealthcareServiceRef result = new HealthcareServiceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}