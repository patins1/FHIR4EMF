package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricColorRefElement")
public class DeviceMetricColorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceMetricColor createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricColor();
	}
	
	public static DeviceMetricColorRef valueOf(String id) {
		DeviceMetricColorRef result = new DeviceMetricColorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}