package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParticipantRequired;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ParticipantRequiredList;
	
	
	
	

public class ParticipantRequiredImplAdapter extends XmlAdapter<String, ParticipantRequired> {

	@Override
	public ParticipantRequired unmarshal(String v) throws Exception {
		ParticipantRequired result = FhirFactory.eINSTANCE.createParticipantRequired();
		result.setValue(ParticipantRequiredList.get(v));
		return result;
	}

	@Override
	public String marshal(ParticipantRequired v) throws Exception {
		return v.getValue().getLiteral();
	}

}
