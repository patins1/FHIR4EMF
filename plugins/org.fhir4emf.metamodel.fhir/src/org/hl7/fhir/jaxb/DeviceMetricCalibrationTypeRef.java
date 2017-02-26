package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricCalibrationTypeRefElement")
public class DeviceMetricCalibrationTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceMetricCalibrationType createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricCalibrationType();
	}
	
	public static DeviceMetricCalibrationTypeRef valueOf(String id) {
		DeviceMetricCalibrationTypeRef result = new DeviceMetricCalibrationTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}