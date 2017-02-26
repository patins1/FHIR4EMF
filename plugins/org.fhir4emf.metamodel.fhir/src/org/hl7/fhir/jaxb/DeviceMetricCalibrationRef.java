package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricCalibration;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricCalibrationRefElement")
public class DeviceMetricCalibrationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DeviceMetricCalibration createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricCalibration();
	}
	
	public static DeviceMetricCalibrationRef valueOf(String id) {
		DeviceMetricCalibrationRef result = new DeviceMetricCalibrationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}