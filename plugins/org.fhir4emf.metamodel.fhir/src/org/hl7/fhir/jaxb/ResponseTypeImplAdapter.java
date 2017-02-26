package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResponseType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ResponseTypeList;
	
	
	
	

public class ResponseTypeImplAdapter extends XmlAdapter<String, ResponseType> {

	@Override
	public ResponseType unmarshal(String v) throws Exception {
		ResponseType result = FhirFactory.eINSTANCE.createResponseType();
		result.setValue(ResponseTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ResponseType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
