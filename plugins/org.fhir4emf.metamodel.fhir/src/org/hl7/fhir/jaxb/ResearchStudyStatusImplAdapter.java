package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchStudyStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ResearchStudyStatusList;
	
	
	
	

public class ResearchStudyStatusImplAdapter extends XmlAdapter<String, ResearchStudyStatus> {

	@Override
	public ResearchStudyStatus unmarshal(String v) throws Exception {
		ResearchStudyStatus result = FhirFactory.eINSTANCE.createResearchStudyStatus();
		result.setValue(ResearchStudyStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ResearchStudyStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
