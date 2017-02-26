package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchModifierCode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SearchModifierCodeList;
	
	
	
	

public class SearchModifierCodeImplAdapter extends XmlAdapter<String, SearchModifierCode> {

	@Override
	public SearchModifierCode unmarshal(String v) throws Exception {
		SearchModifierCode result = FhirFactory.eINSTANCE.createSearchModifierCode();
		result.setValue(SearchModifierCodeList.get(v));
		return result;
	}

	@Override
	public String marshal(SearchModifierCode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
