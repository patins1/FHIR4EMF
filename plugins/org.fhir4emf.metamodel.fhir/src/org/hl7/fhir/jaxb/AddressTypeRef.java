package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AddressType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AddressTypeRefElement")
public class AddressTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AddressType createInstance() {
		return FhirFactory.eINSTANCE.createAddressType();
	}
	
	public static AddressTypeRef valueOf(String id) {
		AddressTypeRef result = new AddressTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}