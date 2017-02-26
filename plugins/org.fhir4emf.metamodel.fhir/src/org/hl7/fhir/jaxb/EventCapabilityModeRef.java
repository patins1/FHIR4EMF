package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EventCapabilityModeRefElement")
public class EventCapabilityModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EventCapabilityMode createInstance() {
		return FhirFactory.eINSTANCE.createEventCapabilityMode();
	}
	
	public static EventCapabilityModeRef valueOf(String id) {
		EventCapabilityModeRef result = new EventCapabilityModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}