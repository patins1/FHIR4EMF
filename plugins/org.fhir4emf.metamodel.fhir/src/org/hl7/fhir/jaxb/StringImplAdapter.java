package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class StringImplAdapter extends XmlAdapter<String, org.hl7.fhir.String> {

	@Override
	public org.hl7.fhir.String unmarshal(String v) throws Exception {
		org.hl7.fhir.String result = FhirFactory.eINSTANCE.createString();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(org.hl7.fhir.String v) throws Exception {
		return v.getValue();
	}

}
