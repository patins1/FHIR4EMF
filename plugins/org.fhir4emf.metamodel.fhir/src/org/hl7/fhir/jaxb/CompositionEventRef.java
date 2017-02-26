package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CompositionEvent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionEventRefElement")
public class CompositionEventRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CompositionEvent createInstance() {
		return FhirFactory.eINSTANCE.createCompositionEvent();
	}
	
	public static CompositionEventRef valueOf(String id) {
		CompositionEventRef result = new CompositionEventRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}