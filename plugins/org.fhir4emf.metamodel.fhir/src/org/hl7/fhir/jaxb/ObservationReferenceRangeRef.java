package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationReferenceRange;

@XmlRootElement(name = "ObservationReferenceRangeRefElement")
public class ObservationReferenceRangeRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ObservationReferenceRange createInstance() {
		return FhirFactory.eINSTANCE.createObservationReferenceRange();
	}
	
	public static ObservationReferenceRangeRef valueOf(String id) {
		ObservationReferenceRangeRef result = new ObservationReferenceRangeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}