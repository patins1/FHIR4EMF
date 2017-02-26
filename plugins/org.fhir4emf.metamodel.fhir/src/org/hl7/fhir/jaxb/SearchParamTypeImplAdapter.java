package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchParamType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SearchParamTypeList;
	
	
	
	

public class SearchParamTypeImplAdapter extends XmlAdapter<String, SearchParamType> {

	@Override
	public SearchParamType unmarshal(String v) throws Exception {
		SearchParamType result = FhirFactory.eINSTANCE.createSearchParamType();
		result.setValue(SearchParamTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(SearchParamType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
