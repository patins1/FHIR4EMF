package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParticipantRequired;

@XmlRootElement(name = "ParticipantRequiredRefElement")
public class ParticipantRequiredRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ParticipantRequired createInstance() {
		return FhirFactory.eINSTANCE.createParticipantRequired();
	}
	
	public static ParticipantRequiredRef valueOf(String id) {
		ParticipantRequiredRef result = new ParticipantRequiredRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}