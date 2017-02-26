package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ObservationComponent;

@XmlRootElement(name = "ObservationComponentRefElement")
public class ObservationComponentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ObservationComponent createInstance() {
		return FhirFactory.eINSTANCE.createObservationComponent();
	}
	
	public static ObservationComponentRef valueOf(String id) {
		ObservationComponentRef result = new ObservationComponentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}