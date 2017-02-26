package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HealthcareServiceNotAvailable;

@XmlRootElement(name = "HealthcareServiceNotAvailableRefElement")
public class HealthcareServiceNotAvailableRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public HealthcareServiceNotAvailable createInstance() {
		return FhirFactory.eINSTANCE.createHealthcareServiceNotAvailable();
	}
	
	public static HealthcareServiceNotAvailableRef valueOf(String id) {
		HealthcareServiceNotAvailableRef result = new HealthcareServiceNotAvailableRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}