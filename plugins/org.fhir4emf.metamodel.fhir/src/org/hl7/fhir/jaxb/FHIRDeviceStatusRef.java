package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FHIRDeviceStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "FHIRDeviceStatusRefElement")
public class FHIRDeviceStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public FHIRDeviceStatus createInstance() {
		return FhirFactory.eINSTANCE.createFHIRDeviceStatus();
	}
	
	public static FHIRDeviceStatusRef valueOf(String id) {
		FHIRDeviceStatusRef result = new FHIRDeviceStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}