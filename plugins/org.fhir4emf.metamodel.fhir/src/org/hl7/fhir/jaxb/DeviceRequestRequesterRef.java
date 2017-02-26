package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceRequestRequester;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceRequestRequesterRefElement")
public class DeviceRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DeviceRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createDeviceRequestRequester();
	}
	
	public static DeviceRequestRequesterRef valueOf(String id) {
		DeviceRequestRequesterRef result = new DeviceRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}