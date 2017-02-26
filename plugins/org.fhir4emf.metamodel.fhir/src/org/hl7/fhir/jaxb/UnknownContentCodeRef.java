package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.UnknownContentCode;

@XmlRootElement(name = "UnknownContentCodeRefElement")
public class UnknownContentCodeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public UnknownContentCode createInstance() {
		return FhirFactory.eINSTANCE.createUnknownContentCode();
	}
	
	public static UnknownContentCodeRef valueOf(String id) {
		UnknownContentCodeRef result = new UnknownContentCodeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}