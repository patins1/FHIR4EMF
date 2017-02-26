package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Appointment;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AppointmentRefElement")
public class AppointmentRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Appointment createInstance() {
		return FhirFactory.eINSTANCE.createAppointment();
	}
	
	public static AppointmentRef valueOf(String id) {
		AppointmentRef result = new AppointmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}