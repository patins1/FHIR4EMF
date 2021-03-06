package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompartmentTypeRefElement")
public class CompartmentTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CompartmentType createInstance() {
		return FhirFactory.eINSTANCE.createCompartmentType();
	}
	
	public static CompartmentTypeRef valueOf(String id) {
		CompartmentTypeRef result = new CompartmentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}