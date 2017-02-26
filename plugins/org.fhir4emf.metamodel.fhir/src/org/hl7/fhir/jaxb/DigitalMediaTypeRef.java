package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DigitalMediaType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DigitalMediaTypeRefElement")
public class DigitalMediaTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DigitalMediaType createInstance() {
		return FhirFactory.eINSTANCE.createDigitalMediaType();
	}
	
	public static DigitalMediaTypeRef valueOf(String id) {
		DigitalMediaTypeRef result = new DigitalMediaTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}