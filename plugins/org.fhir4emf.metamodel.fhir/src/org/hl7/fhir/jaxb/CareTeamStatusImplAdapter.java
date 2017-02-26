package org.hl7.fhir.jaxb;

import org.hl7.fhir.CareTeamStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CareTeamStatusList;
	
	
	
	

public class CareTeamStatusImplAdapter extends XmlAdapter<String, CareTeamStatus> {

	@Override
	public CareTeamStatus unmarshal(String v) throws Exception {
		CareTeamStatus result = FhirFactory.eINSTANCE.createCareTeamStatus();
		result.setValue(CareTeamStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(CareTeamStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
