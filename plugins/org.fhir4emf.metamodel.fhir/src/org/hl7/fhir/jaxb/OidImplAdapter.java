package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Oid;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import java.lang.String;
	
	
	
	

public class OidImplAdapter extends XmlAdapter<String, Oid> {

	@Override
	public Oid unmarshal(String v) throws Exception {
		Oid result = FhirFactory.eINSTANCE.createOid();
		result.setValue(v);
		return result;
	}

	@Override
	public String marshal(Oid v) throws Exception {
		return v.getValue();
	}

}
