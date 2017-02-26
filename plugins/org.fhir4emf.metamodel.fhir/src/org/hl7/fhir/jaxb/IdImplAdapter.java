package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Id;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class IdImplAdapter extends XmlAdapter<String, Id> {

	@Override
	public Id unmarshal(String v) throws Exception {
		Id result = FhirFactory.eINSTANCE.createId();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Id v) throws Exception {
		return v.getValue();
	}

}
