package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FlagStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FlagStatusList;
	
	
	
	

public class FlagStatusImplAdapter extends XmlAdapter<String, FlagStatus> {

	@Override
	public FlagStatus unmarshal(String v) throws Exception {
		FlagStatus result = FhirFactory.eINSTANCE.createFlagStatus();
		result.setValue(FlagStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(FlagStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
