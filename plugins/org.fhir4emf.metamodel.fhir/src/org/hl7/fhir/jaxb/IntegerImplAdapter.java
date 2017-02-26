package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
	
	
	

public class IntegerImplAdapter extends XmlAdapter<Integer, org.hl7.fhir.Integer> {

	@Override
	public org.hl7.fhir.Integer unmarshal(Integer v) throws Exception {
		org.hl7.fhir.Integer result = FhirFactory.eINSTANCE.createInteger();
		result.setValue(v);
		return result;
	}

	@Override
	public Integer marshal(org.hl7.fhir.Integer v) throws Exception {
		return v.getValue();
	}

}
