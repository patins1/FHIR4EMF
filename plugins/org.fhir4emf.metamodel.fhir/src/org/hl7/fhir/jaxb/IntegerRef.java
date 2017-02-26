package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "IntegerRefElement")
public class IntegerRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public org.hl7.fhir.Integer createInstance() {
		return FhirFactory.eINSTANCE.createInteger();
	}
	
	public static IntegerRef valueOf(String id) {
		IntegerRef result = new IntegerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}