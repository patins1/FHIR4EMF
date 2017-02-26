package org.hl7.fhir.jaxb;

import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EncounterStatusList;
	
	
	
	

public class EncounterStatusImplAdapter extends XmlAdapter<String, EncounterStatus> {

	@Override
	public EncounterStatus unmarshal(String v) throws Exception {
		EncounterStatus result = FhirFactory.eINSTANCE.createEncounterStatus();
		result.setValue(EncounterStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(EncounterStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
