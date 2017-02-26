package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ObservationStatusList;
	
	
	
	

public class ObservationStatusImplAdapter extends XmlAdapter<String, ObservationStatus> {

	@Override
	public ObservationStatus unmarshal(String v) throws Exception {
		ObservationStatus result = FhirFactory.eINSTANCE.createObservationStatus();
		result.setValue(ObservationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ObservationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
