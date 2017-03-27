package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceUseStatementStatusRefElement")
public class DeviceUseStatementStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DeviceUseStatementStatus createInstance() {
		return FhirFactory.eINSTANCE.createDeviceUseStatementStatus();
	}
	
	public static DeviceUseStatementStatusRef valueOf(String id) {
		DeviceUseStatementStatusRef result = new DeviceUseStatementStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}