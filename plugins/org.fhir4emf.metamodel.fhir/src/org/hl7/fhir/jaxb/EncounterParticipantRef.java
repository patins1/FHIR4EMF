package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterParticipant;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterParticipantRefElement")
public class EncounterParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterParticipant createInstance() {
		return FhirFactory.eINSTANCE.createEncounterParticipant();
	}
	
	public static EncounterParticipantRef valueOf(String id) {
		EncounterParticipantRef result = new EncounterParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}