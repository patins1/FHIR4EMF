package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RepositoryType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.RepositoryTypeList;
	
	
	
	

public class RepositoryTypeImplAdapter extends XmlAdapter<String, RepositoryType> {

	@Override
	public RepositoryType unmarshal(String v) throws Exception {
		RepositoryType result = FhirFactory.eINSTANCE.createRepositoryType();
		result.setValue(RepositoryTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(RepositoryType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
