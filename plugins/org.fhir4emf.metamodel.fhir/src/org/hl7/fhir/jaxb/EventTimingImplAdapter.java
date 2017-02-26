package org.hl7.fhir.jaxb;

import org.hl7.fhir.EventTiming;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EventTimingList;
	
	
	
	

public class EventTimingImplAdapter extends XmlAdapter<String, EventTiming> {

	@Override
	public EventTiming unmarshal(String v) throws Exception {
		EventTiming result = FhirFactory.eINSTANCE.createEventTiming();
		result.setValue(EventTimingList.get(v));
		return result;
	}

	@Override
	public String marshal(EventTiming v) throws Exception {
		return v.getValue().getLiteral();
	}

}
