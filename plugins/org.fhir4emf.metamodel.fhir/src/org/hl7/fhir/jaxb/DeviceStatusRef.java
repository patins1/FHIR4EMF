package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceStatusRefElement")
public class DeviceStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceStatus createInstance() {
		return FhirFactory.eINSTANCE.createDeviceStatus();
	}
	
	public static DeviceStatusRef valueOf(String id) {
		DeviceStatusRef result = new DeviceStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}