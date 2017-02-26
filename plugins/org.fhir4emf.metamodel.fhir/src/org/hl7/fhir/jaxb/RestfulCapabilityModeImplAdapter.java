package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RestfulCapabilityMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RestfulCapabilityModeList;
	
	
	
	

public class RestfulCapabilityModeImplAdapter extends XmlAdapter<String, RestfulCapabilityMode> {

	@Override
	public RestfulCapabilityMode unmarshal(String v) throws Exception {
		RestfulCapabilityMode result = FhirFactory.eINSTANCE.createRestfulCapabilityMode();
		result.setValue(RestfulCapabilityModeList.get(v));
		return result;
	}

	@Override
	public String marshal(RestfulCapabilityMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
