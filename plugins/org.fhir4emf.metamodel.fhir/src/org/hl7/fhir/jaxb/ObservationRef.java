package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Observation;

@XmlRootElement(name = "ObservationRefElement")
public class ObservationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Observation createInstance() {
		return FhirFactory.eINSTANCE.createObservation();
	}
	
	public static ObservationRef valueOf(String id) {
		ObservationRef result = new ObservationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}