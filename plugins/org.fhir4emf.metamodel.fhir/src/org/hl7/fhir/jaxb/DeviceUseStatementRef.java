package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceUseStatementRefElement")
public class DeviceUseStatementRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DeviceUseStatement createInstance() {
		return FhirFactory.eINSTANCE.createDeviceUseStatement();
	}
	
	public static DeviceUseStatementRef valueOf(String id) {
		DeviceUseStatementRef result = new DeviceUseStatementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}