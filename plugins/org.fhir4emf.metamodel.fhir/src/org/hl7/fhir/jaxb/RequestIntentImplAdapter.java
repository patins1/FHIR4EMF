package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestIntent;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RequestIntentList;
	
	
	
	

public class RequestIntentImplAdapter extends XmlAdapter<String, RequestIntent> {

	@Override
	public RequestIntent unmarshal(String v) throws Exception {
		RequestIntent result = FhirFactory.eINSTANCE.createRequestIntent();
		result.setValue(RequestIntentList.get(v));
		return result;
	}

	@Override
	public String marshal(RequestIntent v) throws Exception {
		return v.getValue().getLiteral();
	}

}
