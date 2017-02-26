package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceMetricCalibrationType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceMetricCalibrationTypeList;
	
	
	
	

public class DeviceMetricCalibrationTypeImplAdapter extends XmlAdapter<String, DeviceMetricCalibrationType> {

	@Override
	public DeviceMetricCalibrationType unmarshal(String v) throws Exception {
		DeviceMetricCalibrationType result = FhirFactory.eINSTANCE.createDeviceMetricCalibrationType();
		result.setValue(DeviceMetricCalibrationTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceMetricCalibrationType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
