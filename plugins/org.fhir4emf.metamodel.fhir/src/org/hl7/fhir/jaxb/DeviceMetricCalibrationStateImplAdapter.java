package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceMetricCalibrationState;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceMetricCalibrationStateList;
	
	
	
	

public class DeviceMetricCalibrationStateImplAdapter extends XmlAdapter<String, DeviceMetricCalibrationState> {

	@Override
	public DeviceMetricCalibrationState unmarshal(String v) throws Exception {
		DeviceMetricCalibrationState result = FhirFactory.eINSTANCE.createDeviceMetricCalibrationState();
		result.setValue(DeviceMetricCalibrationStateList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceMetricCalibrationState v) throws Exception {
		return v.getValue().getLiteral();
	}

}
