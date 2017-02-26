package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Composition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CompositionRefElement")
public class CompositionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Composition createInstance() {
		return FhirFactory.eINSTANCE.createComposition();
	}
	
	public static CompositionRef valueOf(String id) {
		CompositionRef result = new CompositionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}