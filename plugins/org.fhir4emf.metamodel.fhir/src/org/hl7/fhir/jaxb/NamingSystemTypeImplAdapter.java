package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NamingSystemType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.NamingSystemTypeList;
	
	
	
	

public class NamingSystemTypeImplAdapter extends XmlAdapter<String, NamingSystemType> {

	@Override
	public NamingSystemType unmarshal(String v) throws Exception {
		NamingSystemType result = FhirFactory.eINSTANCE.createNamingSystemType();
		result.setValue(NamingSystemTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(NamingSystemType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
