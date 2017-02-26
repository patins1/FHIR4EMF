package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParticipationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ParticipationStatusList;
	
	
	
	

public class ParticipationStatusImplAdapter extends XmlAdapter<String, ParticipationStatus> {

	@Override
	public ParticipationStatus unmarshal(String v) throws Exception {
		ParticipationStatus result = FhirFactory.eINSTANCE.createParticipationStatus();
		result.setValue(ParticipationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ParticipationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
