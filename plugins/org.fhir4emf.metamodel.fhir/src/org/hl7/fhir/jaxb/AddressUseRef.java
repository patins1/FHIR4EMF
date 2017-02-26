package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AddressUse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AddressUseRefElement")
public class AddressUseRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AddressUse createInstance() {
		return FhirFactory.eINSTANCE.createAddressUse();
	}
	
	public static AddressUseRef valueOf(String id) {
		AddressUseRef result = new AddressUseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}