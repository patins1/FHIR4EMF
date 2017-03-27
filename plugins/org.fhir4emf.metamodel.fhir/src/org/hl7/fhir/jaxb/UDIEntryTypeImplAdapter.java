package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UDIEntryType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.UDIEntryTypeList;
	
	
	
	

public class UDIEntryTypeImplAdapter extends XmlAdapter<String, UDIEntryType> {

	@Override
	public UDIEntryType unmarshal(String v) throws Exception {
		UDIEntryType result = FhirFactory.eINSTANCE.createUDIEntryType();
		result.setValue(UDIEntryTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(UDIEntryType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
