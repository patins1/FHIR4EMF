package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Practitioner;

@XmlRootElement(name = "PractitionerRefElement")
public class PractitionerRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Practitioner createInstance() {
		return FhirFactory.eINSTANCE.createPractitioner();
	}
	
	public static PractitionerRef valueOf(String id) {
		PractitionerRef result = new PractitionerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}