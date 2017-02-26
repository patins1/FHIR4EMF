package org.hl7.fhir.jaxb;

import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EncounterLocationStatusList;
	
	
	
	

public class EncounterLocationStatusImplAdapter extends XmlAdapter<String, EncounterLocationStatus> {

	@Override
	public EncounterLocationStatus unmarshal(String v) throws Exception {
		EncounterLocationStatus result = FhirFactory.eINSTANCE.createEncounterLocationStatus();
		result.setValue(EncounterLocationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(EncounterLocationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
