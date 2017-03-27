package org.hl7.fhir.jaxb;

import org.hl7.fhir.ConsentState;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ConsentStateList;
	
	
	
	

public class ConsentStateImplAdapter extends XmlAdapter<String, ConsentState> {

	@Override
	public ConsentState unmarshal(String v) throws Exception {
		ConsentState result = FhirFactory.eINSTANCE.createConsentState();
		result.setValue(ConsentStateList.get(v));
		return result;
	}

	@Override
	public String marshal(ConsentState v) throws Exception {
		return v.getValue().getLiteral();
	}

}
