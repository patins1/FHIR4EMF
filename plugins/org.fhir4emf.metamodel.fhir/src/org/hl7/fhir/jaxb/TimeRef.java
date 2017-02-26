package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Time;

@XmlRootElement(name = "TimeRefElement")
public class TimeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Time createInstance() {
		return FhirFactory.eINSTANCE.createTime();
	}
	
	public static TimeRef valueOf(String id) {
		TimeRef result = new TimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}