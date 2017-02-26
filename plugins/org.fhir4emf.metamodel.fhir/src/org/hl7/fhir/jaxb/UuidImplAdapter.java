package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Uuid;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class UuidImplAdapter extends XmlAdapter<String, Uuid> {

	@Override
	public Uuid unmarshal(String v) throws Exception {
		Uuid result = FhirFactory.eINSTANCE.createUuid();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Uuid v) throws Exception {
		return v.getValue();
	}

}
