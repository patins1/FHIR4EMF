package org.hl7.fhir.jaxb;

import org.hl7.fhir.Code;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class CodeImplAdapter extends XmlAdapter<String, Code> {

	@Override
	public Code unmarshal(String v) throws Exception {
		Code result = FhirFactory.eINSTANCE.createCode();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Code v) throws Exception {
		return v.getValue();
	}

}
