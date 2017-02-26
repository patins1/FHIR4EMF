package org.hl7.fhir.jaxb;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
	
	
	

public class Base64BinaryImplAdapter extends XmlAdapter<byte[], Base64Binary> {

	@Override
	public Base64Binary unmarshal(byte[] v) throws Exception {
		Base64Binary result = FhirFactory.eINSTANCE.createBase64Binary();
		result.setValue(v);
		return result;
	}

	@Override
	public byte[] marshal(Base64Binary v) throws Exception {
		return v.getValue();
	}

}
