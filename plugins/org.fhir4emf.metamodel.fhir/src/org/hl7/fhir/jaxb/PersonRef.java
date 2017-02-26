package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Person;

@XmlRootElement(name = "PersonRefElement")
public class PersonRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Person createInstance() {
		return FhirFactory.eINSTANCE.createPerson();
	}
	
	public static PersonRef valueOf(String id) {
		PersonRef result = new PersonRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}