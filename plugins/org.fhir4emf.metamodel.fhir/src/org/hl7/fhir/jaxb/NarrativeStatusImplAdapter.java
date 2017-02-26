package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NarrativeStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NarrativeStatusList;
	
	
	
	

public class NarrativeStatusImplAdapter extends XmlAdapter<String, NarrativeStatus> {

	@Override
	public NarrativeStatus unmarshal(String v) throws Exception {
		NarrativeStatus result = FhirFactory.eINSTANCE.createNarrativeStatus();
		result.setValue(NarrativeStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(NarrativeStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
