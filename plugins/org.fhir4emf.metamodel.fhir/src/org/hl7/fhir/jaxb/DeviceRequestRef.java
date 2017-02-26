package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceRequest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceRequestRefElement")
public class DeviceRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DeviceRequest createInstance() {
		return FhirFactory.eINSTANCE.createDeviceRequest();
	}
	
	public static DeviceRequestRef valueOf(String id) {
		DeviceRequestRef result = new DeviceRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}