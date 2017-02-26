package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.HTTPVerb;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.HTTPVerbList;
	
	
	
	

public class HTTPVerbImplAdapter extends XmlAdapter<String, HTTPVerb> {

	@Override
	public HTTPVerb unmarshal(String v) throws Exception {
		HTTPVerb result = FhirFactory.eINSTANCE.createHTTPVerb();
		result.setValue(HTTPVerbList.get(v));
		return result;
	}

	@Override
	public String marshal(HTTPVerb v) throws Exception {
		return v.getValue().getLiteral();
	}

}
