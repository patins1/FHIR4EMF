package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DaysOfWeek;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DaysOfWeekRefElement")
public class DaysOfWeekRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DaysOfWeek createInstance() {
		return FhirFactory.eINSTANCE.createDaysOfWeek();
	}
	
	public static DaysOfWeekRef valueOf(String id) {
		DaysOfWeekRef result = new DaysOfWeekRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}