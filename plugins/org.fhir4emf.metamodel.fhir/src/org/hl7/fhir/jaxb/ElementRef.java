package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Element;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementRefElement")
public class ElementRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public Element createInstance() {
		return FhirFactory.eINSTANCE.createElement();
	}
	
	public static ElementRef valueOf(String id) {
		ElementRef result = new ElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}