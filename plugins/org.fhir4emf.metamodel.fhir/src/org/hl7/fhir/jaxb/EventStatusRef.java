package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EventStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EventStatusRefElement")
public class EventStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EventStatus createInstance() {
		return FhirFactory.eINSTANCE.createEventStatus();
	}
	
	public static EventStatusRef valueOf(String id) {
		EventStatusRef result = new EventStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}