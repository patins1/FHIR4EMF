package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UDIEntryType;

@XmlRootElement(name = "UDIEntryTypeRefElement")
public class UDIEntryTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public UDIEntryType createInstance() {
		return FhirFactory.eINSTANCE.createUDIEntryType();
	}
	
	public static UDIEntryTypeRef valueOf(String id) {
		UDIEntryTypeRef result = new UDIEntryTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}