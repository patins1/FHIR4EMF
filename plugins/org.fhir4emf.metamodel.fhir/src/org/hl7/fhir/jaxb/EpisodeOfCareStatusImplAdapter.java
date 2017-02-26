package org.hl7.fhir.jaxb;

import org.hl7.fhir.EpisodeOfCareStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.EpisodeOfCareStatusList;
	
	
	
	

public class EpisodeOfCareStatusImplAdapter extends XmlAdapter<String, EpisodeOfCareStatus> {

	@Override
	public EpisodeOfCareStatus unmarshal(String v) throws Exception {
		EpisodeOfCareStatus result = FhirFactory.eINSTANCE.createEpisodeOfCareStatus();
		result.setValue(EpisodeOfCareStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(EpisodeOfCareStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
