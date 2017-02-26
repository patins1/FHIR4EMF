package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Device;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceRefElement")
public class DeviceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Device createInstance() {
		return FhirFactory.eINSTANCE.createDevice();
	}
	
	public static DeviceRef valueOf(String id) {
		DeviceRef result = new DeviceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}