package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnknownContentCode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.UnknownContentCodeList;
	
	
	
	

public class UnknownContentCodeImplAdapter extends XmlAdapter<String, UnknownContentCode> {

	@Override
	public UnknownContentCode unmarshal(String v) throws Exception {
		UnknownContentCode result = FhirFactory.eINSTANCE.createUnknownContentCode();
		result.setValue(UnknownContentCodeList.get(v));
		return result;
	}

	@Override
	public String marshal(UnknownContentCode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
