package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestPriority;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RequestPriorityList;
	
	
	
	

public class RequestPriorityImplAdapter extends XmlAdapter<String, RequestPriority> {

	@Override
	public RequestPriority unmarshal(String v) throws Exception {
		RequestPriority result = FhirFactory.eINSTANCE.createRequestPriority();
		result.setValue(RequestPriorityList.get(v));
		return result;
	}

	@Override
	public String marshal(RequestPriority v) throws Exception {
		return v.getValue().getLiteral();
	}

}
