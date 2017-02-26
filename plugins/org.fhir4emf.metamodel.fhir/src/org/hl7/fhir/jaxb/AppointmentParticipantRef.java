package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AppointmentParticipant;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AppointmentParticipantRefElement")
public class AppointmentParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AppointmentParticipant createInstance() {
		return FhirFactory.eINSTANCE.createAppointmentParticipant();
	}
	
	public static AppointmentParticipantRef valueOf(String id) {
		AppointmentParticipantRef result = new AppointmentParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}