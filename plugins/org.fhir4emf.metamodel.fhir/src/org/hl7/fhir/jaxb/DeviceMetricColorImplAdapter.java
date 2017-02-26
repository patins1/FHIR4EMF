package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceMetricColor;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceMetricColorList;
	
	
	
	

public class DeviceMetricColorImplAdapter extends XmlAdapter<String, DeviceMetricColor> {

	@Override
	public DeviceMetricColor unmarshal(String v) throws Exception {
		DeviceMetricColor result = FhirFactory.eINSTANCE.createDeviceMetricColor();
		result.setValue(DeviceMetricColorList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceMetricColor v) throws Exception {
		return v.getValue().getLiteral();
	}

}
