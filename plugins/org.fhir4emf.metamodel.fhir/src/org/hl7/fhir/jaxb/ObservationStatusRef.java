package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationStatus;

@XmlRootElement(name = "ObservationStatusRefElement")
public class ObservationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ObservationStatus createInstance() {
		return FhirFactory.eINSTANCE.createObservationStatus();
	}
	
	public static ObservationStatusRef valueOf(String id) {
		ObservationStatusRef result = new ObservationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}