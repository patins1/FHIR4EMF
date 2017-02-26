package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AppointmentResponseRefElement")
public class AppointmentResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public AppointmentResponse createInstance() {
		return FhirFactory.eINSTANCE.createAppointmentResponse();
	}
	
	public static AppointmentResponseRef valueOf(String id) {
		AppointmentResponseRef result = new AppointmentResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}