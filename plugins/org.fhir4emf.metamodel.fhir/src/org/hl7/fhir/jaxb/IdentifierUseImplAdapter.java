package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.IdentifierUse;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.IdentifierUseList;
	
	
	
	

public class IdentifierUseImplAdapter extends XmlAdapter<String, IdentifierUse> {

	@Override
	public IdentifierUse unmarshal(String v) throws Exception {
		IdentifierUse result = FhirFactory.eINSTANCE.createIdentifierUse();
		result.setValue(IdentifierUseList.get(v));
		return result;
	}

	@Override
	public String marshal(IdentifierUse v) throws Exception {
		return v.getValue().getLiteral();
	}

}
