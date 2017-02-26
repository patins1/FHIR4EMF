package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResearchSubjectStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ResearchSubjectStatusList;
	
	
	
	

public class ResearchSubjectStatusImplAdapter extends XmlAdapter<String, ResearchSubjectStatus> {

	@Override
	public ResearchSubjectStatus unmarshal(String v) throws Exception {
		ResearchSubjectStatus result = FhirFactory.eINSTANCE.createResearchSubjectStatus();
		result.setValue(ResearchSubjectStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ResearchSubjectStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
