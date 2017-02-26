package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SequenceType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SequenceTypeList;
	
	
	
	

public class SequenceTypeImplAdapter extends XmlAdapter<String, SequenceType> {

	@Override
	public SequenceType unmarshal(String v) throws Exception {
		SequenceType result = FhirFactory.eINSTANCE.createSequenceType();
		result.setValue(SequenceTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(SequenceType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
