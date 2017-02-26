package org.hl7.fhir.jaxb;

import org.hl7.fhir.AddressType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AddressTypeList;
	
	
	
	

public class AddressTypeImplAdapter extends XmlAdapter<String, AddressType> {

	@Override
	public AddressType unmarshal(String v) throws Exception {
		AddressType result = FhirFactory.eINSTANCE.createAddressType();
		result.setValue(AddressTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(AddressType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
