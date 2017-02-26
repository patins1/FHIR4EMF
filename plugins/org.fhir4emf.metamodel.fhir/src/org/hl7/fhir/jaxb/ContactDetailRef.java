package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContactDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContactDetailRefElement")
public class ContactDetailRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContactDetail createInstance() {
		return FhirFactory.eINSTANCE.createContactDetail();
	}
	
	public static ContactDetailRef valueOf(String id) {
		ContactDetailRef result = new ContactDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}