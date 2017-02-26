package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ListMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ListModeList;
	
	
	
	

public class ListModeImplAdapter extends XmlAdapter<String, ListMode> {

	@Override
	public ListMode unmarshal(String v) throws Exception {
		ListMode result = FhirFactory.eINSTANCE.createListMode();
		result.setValue(ListModeList.get(v));
		return result;
	}

	@Override
	public String marshal(ListMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
