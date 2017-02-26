package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContactPointUse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContactPointUseRefElement")
public class ContactPointUseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContactPointUse createInstance() {
		return FhirFactory.eINSTANCE.createContactPointUse();
	}
	
	public static ContactPointUseRef valueOf(String id) {
		ContactPointUseRef result = new ContactPointUseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}