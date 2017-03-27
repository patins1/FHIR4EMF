package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RequestStatusList;
	
	
	
	

public class RequestStatusImplAdapter extends XmlAdapter<String, RequestStatus> {

	@Override
	public RequestStatus unmarshal(String v) throws Exception {
		RequestStatus result = FhirFactory.eINSTANCE.createRequestStatus();
		result.setValue(RequestStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(RequestStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
