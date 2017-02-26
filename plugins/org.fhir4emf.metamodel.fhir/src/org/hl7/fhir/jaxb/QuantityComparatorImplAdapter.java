package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.QuantityComparator;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.QuantityComparatorList;
	
	
	
	

public class QuantityComparatorImplAdapter extends XmlAdapter<String, QuantityComparator> {

	@Override
	public QuantityComparator unmarshal(String v) throws Exception {
		QuantityComparator result = FhirFactory.eINSTANCE.createQuantityComparator();
		result.setValue(QuantityComparatorList.get(v));
		return result;
	}

	@Override
	public String marshal(QuantityComparator v) throws Exception {
		return v.getValue().getLiteral();
	}

}
