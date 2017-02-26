package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetricCategory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricCategoryRefElement")
public class DeviceMetricCategoryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceMetricCategory createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetricCategory();
	}
	
	public static DeviceMetricCategoryRef valueOf(String id) {
		DeviceMetricCategoryRef result = new DeviceMetricCategoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}