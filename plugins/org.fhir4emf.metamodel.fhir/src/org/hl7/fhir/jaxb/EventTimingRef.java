package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EventTiming;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EventTimingRefElement")
public class EventTimingRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EventTiming createInstance() {
		return FhirFactory.eINSTANCE.createEventTiming();
	}
	
	public static EventTimingRef valueOf(String id) {
		EventTimingRef result = new EventTimingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}