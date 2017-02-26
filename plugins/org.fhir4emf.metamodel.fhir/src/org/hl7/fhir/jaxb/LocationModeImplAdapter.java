package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LocationMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.LocationModeList;
	
	
	
	

public class LocationModeImplAdapter extends XmlAdapter<String, LocationMode> {

	@Override
	public LocationMode unmarshal(String v) throws Exception {
		LocationMode result = FhirFactory.eINSTANCE.createLocationMode();
		result.setValue(LocationModeList.get(v));
		return result;
	}

	@Override
	public String marshal(LocationMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
