package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Base64Binary;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "Base64BinaryRefElement")
public class Base64BinaryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Base64Binary createInstance() {
		return FhirFactory.eINSTANCE.createBase64Binary();
	}
	
	public static Base64BinaryRef valueOf(String id) {
		Base64BinaryRef result = new Base64BinaryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}