package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContactPoint;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContactPointRefElement")
public class ContactPointRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContactPoint createInstance() {
		return FhirFactory.eINSTANCE.createContactPoint();
	}
	
	public static ContactPointRef valueOf(String id) {
		ContactPointRef result = new ContactPointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}