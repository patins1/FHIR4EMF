package org.hl7.fhir.jaxb;

import org.hl7.fhir.EventCapabilityMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EventCapabilityModeList;
	
	
	
	

public class EventCapabilityModeImplAdapter extends XmlAdapter<String, EventCapabilityMode> {

	@Override
	public EventCapabilityMode unmarshal(String v) throws Exception {
		EventCapabilityMode result = FhirFactory.eINSTANCE.createEventCapabilityMode();
		result.setValue(EventCapabilityModeList.get(v));
		return result;
	}

	@Override
	public String marshal(EventCapabilityMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
