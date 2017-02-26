package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParticipationStatus;

@XmlRootElement(name = "ParticipationStatusRefElement")
public class ParticipationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ParticipationStatus createInstance() {
		return FhirFactory.eINSTANCE.createParticipationStatus();
	}
	
	public static ParticipationStatusRef valueOf(String id) {
		ParticipationStatusRef result = new ParticipationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}