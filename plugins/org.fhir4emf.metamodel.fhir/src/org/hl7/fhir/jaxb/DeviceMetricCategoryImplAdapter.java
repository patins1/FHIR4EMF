package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceMetricCategoryList;
	
	
	
	

public class DeviceMetricCategoryImplAdapter extends XmlAdapter<String, DeviceMetricCategory> {

	@Override
	public DeviceMetricCategory unmarshal(String v) throws Exception {
		DeviceMetricCategory result = FhirFactory.eINSTANCE.createDeviceMetricCategory();
		result.setValue(DeviceMetricCategoryList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceMetricCategory v) throws Exception {
		return v.getValue().getLiteral();
	}

}
