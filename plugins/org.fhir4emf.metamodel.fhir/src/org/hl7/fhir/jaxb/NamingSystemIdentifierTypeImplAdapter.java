package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystemIdentifierType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NamingSystemIdentifierTypeList;
	
	
	
	

public class NamingSystemIdentifierTypeImplAdapter extends XmlAdapter<String, NamingSystemIdentifierType> {

	@Override
	public NamingSystemIdentifierType unmarshal(String v) throws Exception {
		NamingSystemIdentifierType result = FhirFactory.eINSTANCE.createNamingSystemIdentifierType();
		result.setValue(NamingSystemIdentifierTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(NamingSystemIdentifierType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
