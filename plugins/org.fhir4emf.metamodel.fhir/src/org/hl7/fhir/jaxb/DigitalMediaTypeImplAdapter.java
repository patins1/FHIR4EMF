package org.hl7.fhir.jaxb;

import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DigitalMediaTypeList;
	
	
	
	

public class DigitalMediaTypeImplAdapter extends XmlAdapter<String, DigitalMediaType> {

	@Override
	public DigitalMediaType unmarshal(String v) throws Exception {
		DigitalMediaType result = FhirFactory.eINSTANCE.createDigitalMediaType();
		result.setValue(DigitalMediaTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(DigitalMediaType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
