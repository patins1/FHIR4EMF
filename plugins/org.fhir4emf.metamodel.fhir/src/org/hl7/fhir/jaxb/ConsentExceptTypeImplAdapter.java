package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConsentExceptType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConsentExceptTypeList;
	
	
	
	

public class ConsentExceptTypeImplAdapter extends XmlAdapter<String, ConsentExceptType> {

	@Override
	public ConsentExceptType unmarshal(String v) throws Exception {
		ConsentExceptType result = FhirFactory.eINSTANCE.createConsentExceptType();
		result.setValue(ConsentExceptTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ConsentExceptType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
