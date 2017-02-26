package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CareTeamParticipant;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CareTeamParticipantRefElement")
public class CareTeamParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CareTeamParticipant createInstance() {
		return FhirFactory.eINSTANCE.createCareTeamParticipant();
	}
	
	public static CareTeamParticipantRef valueOf(String id) {
		CareTeamParticipantRef result = new CareTeamParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}