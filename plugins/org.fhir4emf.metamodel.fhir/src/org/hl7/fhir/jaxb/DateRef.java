package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Date;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DateRefElement")
public class DateRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Date createInstance() {
		return FhirFactory.eINSTANCE.createDate();
	}
	
	public static DateRef valueOf(String id) {
		DateRef result = new DateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}