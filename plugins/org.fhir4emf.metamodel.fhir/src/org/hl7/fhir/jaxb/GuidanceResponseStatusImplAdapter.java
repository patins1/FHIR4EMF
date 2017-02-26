package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuidanceResponseStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GuidanceResponseStatusList;
	
	
	
	

public class GuidanceResponseStatusImplAdapter extends XmlAdapter<String, GuidanceResponseStatus> {

	@Override
	public GuidanceResponseStatus unmarshal(String v) throws Exception {
		GuidanceResponseStatus result = FhirFactory.eINSTANCE.createGuidanceResponseStatus();
		result.setValue(GuidanceResponseStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(GuidanceResponseStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
