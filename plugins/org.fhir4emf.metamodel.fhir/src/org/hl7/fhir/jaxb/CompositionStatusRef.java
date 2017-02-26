package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionStatusRefElement")
public class CompositionStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public CompositionStatus createInstance() {
		return FhirFactory.eINSTANCE.createCompositionStatus();
	}
	
	public static CompositionStatusRef valueOf(String id) {
		CompositionStatusRef result = new CompositionStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}