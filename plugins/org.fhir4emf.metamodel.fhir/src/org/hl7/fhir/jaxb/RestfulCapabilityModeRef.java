package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RestfulCapabilityMode;

@XmlRootElement(name = "RestfulCapabilityModeRefElement")
public class RestfulCapabilityModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RestfulCapabilityMode createInstance() {
		return FhirFactory.eINSTANCE.createRestfulCapabilityMode();
	}
	
	public static RestfulCapabilityModeRef valueOf(String id) {
		RestfulCapabilityModeRef result = new RestfulCapabilityModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}