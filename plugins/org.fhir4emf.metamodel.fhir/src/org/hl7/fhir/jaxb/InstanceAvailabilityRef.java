package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.InstanceAvailability;

@XmlRootElement(name = "InstanceAvailabilityRefElement")
public class InstanceAvailabilityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public InstanceAvailability createInstance() {
		return FhirFactory.eINSTANCE.createInstanceAvailability();
	}
	
	public static InstanceAvailabilityRef valueOf(String id) {
		InstanceAvailabilityRef result = new InstanceAvailabilityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}