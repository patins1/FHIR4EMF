package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricCalibrationStateRefElement")
public class DeviceMetricCalibrationStateRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceMetricCalibrationState createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricCalibrationState();
	}
	
	public static DeviceMetricCalibrationStateRef valueOf(String id) {
		DeviceMetricCalibrationStateRef result = new DeviceMetricCalibrationStateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}