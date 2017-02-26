package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceMetricRefElement")
public class DeviceMetricRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DeviceMetric createInstance() {
		return FhirFactory.eINSTANCE.createDeviceMetric();
	}
	
	public static DeviceMetricRef valueOf(String id) {
		DeviceMetricRef result = new DeviceMetricRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}