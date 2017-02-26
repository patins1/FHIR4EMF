package org.hl7.fhir.jaxb;

import org.hl7.fhir.AddressUse;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AddressUseList;
	
	
	
	

public class AddressUseImplAdapter extends XmlAdapter<String, AddressUse> {

	@Override
	public AddressUse unmarshal(String v) throws Exception {
		AddressUse result = FhirFactory.eINSTANCE.createAddressUse();
		result.setValue(AddressUseList.get(v));
		return result;
	}

	@Override
	public String marshal(AddressUse v) throws Exception {
		return v.getValue().getLiteral();
	}

}
