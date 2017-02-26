package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NameUse;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NameUseList;
	
	
	
	

public class NameUseImplAdapter extends XmlAdapter<String, NameUse> {

	@Override
	public NameUse unmarshal(String v) throws Exception {
		NameUse result = FhirFactory.eINSTANCE.createNameUse();
		result.setValue(NameUseList.get(v));
		return result;
	}

	@Override
	public String marshal(NameUse v) throws Exception {
		return v.getValue().getLiteral();
	}

}
