package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationRelated;

@XmlRootElement(name = "ObservationRelatedRefElement")
public class ObservationRelatedRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ObservationRelated createInstance() {
		return FhirFactory.eINSTANCE.createObservationRelated();
	}
	
	public static ObservationRelatedRef valueOf(String id) {
		ObservationRelatedRef result = new ObservationRelatedRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}