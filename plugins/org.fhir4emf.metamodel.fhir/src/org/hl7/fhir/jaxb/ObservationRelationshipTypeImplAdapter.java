package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationRelationshipType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ObservationRelationshipTypeList;
	
	
	
	

public class ObservationRelationshipTypeImplAdapter extends XmlAdapter<String, ObservationRelationshipType> {

	@Override
	public ObservationRelationshipType unmarshal(String v) throws Exception {
		ObservationRelationshipType result = FhirFactory.eINSTANCE.createObservationRelationshipType();
		result.setValue(ObservationRelationshipTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ObservationRelationshipType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
