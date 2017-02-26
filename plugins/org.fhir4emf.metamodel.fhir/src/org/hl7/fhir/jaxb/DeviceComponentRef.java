package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceComponentRefElement")
public class DeviceComponentRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DeviceComponent createInstance() {
		return FhirFactory.eINSTANCE.createDeviceComponent();
	}
	
	public static DeviceComponentRef valueOf(String id) {
		DeviceComponentRef result = new DeviceComponentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}