package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ListStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ListStatusList;
	
	
	
	

public class ListStatusImplAdapter extends XmlAdapter<String, ListStatus> {

	@Override
	public ListStatus unmarshal(String v) throws Exception {
		ListStatus result = FhirFactory.eINSTANCE.createListStatus();
		result.setValue(ListStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ListStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
