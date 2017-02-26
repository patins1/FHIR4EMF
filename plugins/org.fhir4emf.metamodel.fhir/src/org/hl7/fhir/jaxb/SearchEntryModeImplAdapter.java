package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SearchEntryMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SearchEntryModeList;
	
	
	
	

public class SearchEntryModeImplAdapter extends XmlAdapter<String, SearchEntryMode> {

	@Override
	public SearchEntryMode unmarshal(String v) throws Exception {
		SearchEntryMode result = FhirFactory.eINSTANCE.createSearchEntryMode();
		result.setValue(SearchEntryModeList.get(v));
		return result;
	}

	@Override
	public String marshal(SearchEntryMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
