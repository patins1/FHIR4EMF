package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchComparator;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SearchComparatorList;
	
	
	
	

public class SearchComparatorImplAdapter extends XmlAdapter<String, SearchComparator> {

	@Override
	public SearchComparator unmarshal(String v) throws Exception {
		SearchComparator result = FhirFactory.eINSTANCE.createSearchComparator();
		result.setValue(SearchComparatorList.get(v));
		return result;
	}

	@Override
	public String marshal(SearchComparator v) throws Exception {
		return v.getValue().getLiteral();
	}

}
