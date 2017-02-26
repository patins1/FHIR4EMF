package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricOperationalStatusRefElement")
public class DeviceMetricOperationalStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceMetricOperationalStatus createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricOperationalStatus();
	}
	
	public static DeviceMetricOperationalStatusRef valueOf(String id) {
		DeviceMetricOperationalStatusRef result = new DeviceMetricOperationalStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}