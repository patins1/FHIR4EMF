package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Instant;

@XmlRootElement(name = "InstantRefElement")
public class InstantRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Instant createInstance() {
		return FhirFactory.eINSTANCE.createInstant();
	}
	
	public static InstantRef valueOf(String id) {
		InstantRef result = new InstantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}