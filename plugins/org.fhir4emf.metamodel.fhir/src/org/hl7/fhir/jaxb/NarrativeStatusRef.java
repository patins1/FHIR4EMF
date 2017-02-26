package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.NarrativeStatus;

@XmlRootElement(name = "NarrativeStatusRefElement")
public class NarrativeStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public NarrativeStatus createInstance() {
		return FhirFactory.eINSTANCE.createNarrativeStatus();
	}
	
	public static NarrativeStatusRef valueOf(String id) {
		NarrativeStatusRef result = new NarrativeStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}