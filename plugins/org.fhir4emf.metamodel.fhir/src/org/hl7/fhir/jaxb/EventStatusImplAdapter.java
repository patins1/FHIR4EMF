package org.hl7.fhir.jaxb;

import org.hl7.fhir.EventStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EventStatusList;
	
	
	
	

public class EventStatusImplAdapter extends XmlAdapter<String, EventStatus> {

	@Override
	public EventStatus unmarshal(String v) throws Exception {
		EventStatus result = FhirFactory.eINSTANCE.createEventStatus();
		result.setValue(EventStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(EventStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
