package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceMetricOperationalStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceMetricOperationalStatusList;
	
	
	
	

public class DeviceMetricOperationalStatusImplAdapter extends XmlAdapter<String, DeviceMetricOperationalStatus> {

	@Override
	public DeviceMetricOperationalStatus unmarshal(String v) throws Exception {
		DeviceMetricOperationalStatus result = FhirFactory.eINSTANCE.createDeviceMetricOperationalStatus();
		result.setValue(DeviceMetricOperationalStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceMetricOperationalStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
