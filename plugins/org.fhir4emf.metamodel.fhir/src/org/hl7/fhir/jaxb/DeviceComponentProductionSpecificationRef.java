package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DeviceComponentProductionSpecification;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DeviceComponentProductionSpecificationRefElement")
public class DeviceComponentProductionSpecificationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DeviceComponentProductionSpecification createInstance() {
		return FhirFactory.eINSTANCE.createDeviceComponentProductionSpecification();
	}
	
	public static DeviceComponentProductionSpecificationRef valueOf(String id) {
		DeviceComponentProductionSpecificationRef result = new DeviceComponentProductionSpecificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}