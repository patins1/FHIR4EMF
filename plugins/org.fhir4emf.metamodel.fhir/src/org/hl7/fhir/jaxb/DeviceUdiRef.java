package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceUdi;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceUdiRefElement")
public class DeviceUdiRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DeviceUdi createInstance() {
		return FhirFactory.eINSTANCE.createDeviceUdi();
	}
	
	public static DeviceUdiRef valueOf(String id) {
		DeviceUdiRef result = new DeviceUdiRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}