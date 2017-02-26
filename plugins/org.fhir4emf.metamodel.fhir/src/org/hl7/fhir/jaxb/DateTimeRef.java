package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DateTime;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DateTimeRefElement")
public class DateTimeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DateTime createInstance() {
		return FhirFactory.eINSTANCE.createDateTime();
	}
	
	public static DateTimeRef valueOf(String id) {
		DateTimeRef result = new DateTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}