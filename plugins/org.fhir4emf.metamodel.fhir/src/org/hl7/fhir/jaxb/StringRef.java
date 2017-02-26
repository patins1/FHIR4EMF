package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "StringRefElement")
public class StringRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public org.hl7.fhir.String createInstance() {
		return FhirFactory.eINSTANCE.createString();
	}
	
	public static StringRef valueOf(String id) {
		StringRef result = new StringRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}