package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.FilterOperator;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FilterOperatorList;
	
	
	
	

public class FilterOperatorImplAdapter extends XmlAdapter<String, FilterOperator> {

	@Override
	public FilterOperator unmarshal(String v) throws Exception {
		FilterOperator result = FhirFactory.eINSTANCE.createFilterOperator();
		result.setValue(FilterOperatorList.get(v));
		return result;
	}

	@Override
	public String marshal(FilterOperator v) throws Exception {
		return v.getValue().getLiteral();
	}

}
