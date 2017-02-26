package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PublicationStatus;

@XmlRootElement(name = "PublicationStatusRefElement")
public class PublicationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public PublicationStatus createInstance() {
		return FhirFactory.eINSTANCE.createPublicationStatus();
	}
	
	public static PublicationStatusRef valueOf(String id) {
		PublicationStatusRef result = new PublicationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}