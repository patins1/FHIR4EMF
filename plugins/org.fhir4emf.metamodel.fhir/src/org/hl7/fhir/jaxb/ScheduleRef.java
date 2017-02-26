package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Schedule;

@XmlRootElement(name = "ScheduleRefElement")
public class ScheduleRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Schedule createInstance() {
		return FhirFactory.eINSTANCE.createSchedule();
	}
	
	public static ScheduleRef valueOf(String id) {
		ScheduleRef result = new ScheduleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}