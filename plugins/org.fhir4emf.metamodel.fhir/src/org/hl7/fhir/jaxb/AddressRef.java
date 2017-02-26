package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Address;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AddressRefElement")
public class AddressRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Address createInstance() {
		return FhirFactory.eINSTANCE.createAddress();
	}
	
	public static AddressRef valueOf(String id) {
		AddressRef result = new AddressRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}