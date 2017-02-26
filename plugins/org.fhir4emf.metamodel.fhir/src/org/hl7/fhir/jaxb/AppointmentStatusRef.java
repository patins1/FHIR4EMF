package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AppointmentStatusRefElement")
public class AppointmentStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AppointmentStatus createInstance() {
		return FhirFactory.eINSTANCE.createAppointmentStatus();
	}
	
	public static AppointmentStatusRef valueOf(String id) {
		AppointmentStatusRef result = new AppointmentStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}