package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContactPointSystem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContactPointSystemRefElement")
public class ContactPointSystemRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContactPointSystem createInstance() {
		return FhirFactory.eINSTANCE.createContactPointSystem();
	}
	
	public static ContactPointSystemRef valueOf(String id) {
		ContactPointSystemRef result = new ContactPointSystemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}