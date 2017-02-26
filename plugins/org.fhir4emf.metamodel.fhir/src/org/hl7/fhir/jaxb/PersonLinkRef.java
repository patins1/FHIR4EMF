package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PersonLink;

@XmlRootElement(name = "PersonLinkRefElement")
public class PersonLinkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PersonLink createInstance() {
		return FhirFactory.eINSTANCE.createPersonLink();
	}
	
	public static PersonLinkRef valueOf(String id) {
		PersonLinkRef result = new PersonLinkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}