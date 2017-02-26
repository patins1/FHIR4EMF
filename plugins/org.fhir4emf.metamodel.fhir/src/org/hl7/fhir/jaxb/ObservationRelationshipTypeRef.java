package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationRelationshipType;

@XmlRootElement(name = "ObservationRelationshipTypeRefElement")
public class ObservationRelationshipTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ObservationRelationshipType createInstance() {
		return FhirFactory.eINSTANCE.createObservationRelationshipType();
	}
	
	public static ObservationRelationshipTypeRef valueOf(String id) {
		ObservationRelationshipTypeRef result = new ObservationRelationshipTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}