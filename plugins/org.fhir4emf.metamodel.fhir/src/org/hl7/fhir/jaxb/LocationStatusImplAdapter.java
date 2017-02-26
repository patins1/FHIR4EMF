package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LocationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.LocationStatusList;
	
	
	
	

public class LocationStatusImplAdapter extends XmlAdapter<String, LocationStatus> {

	@Override
	public LocationStatus unmarshal(String v) throws Exception {
		LocationStatus result = FhirFactory.eINSTANCE.createLocationStatus();
		result.setValue(LocationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(LocationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
