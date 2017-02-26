package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceStatusList;
	
	
	
	

public class DeviceStatusImplAdapter extends XmlAdapter<String, DeviceStatus> {

	@Override
	public DeviceStatus unmarshal(String v) throws Exception {
		DeviceStatus result = FhirFactory.eINSTANCE.createDeviceStatus();
		result.setValue(DeviceStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
