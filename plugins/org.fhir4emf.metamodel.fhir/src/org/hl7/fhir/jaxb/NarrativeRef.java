package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Narrative;

@XmlRootElement(name = "NarrativeRefElement")
public class NarrativeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Narrative createInstance() {
		return FhirFactory.eINSTANCE.createNarrative();
	}
	
	public static NarrativeRef valueOf(String id) {
		NarrativeRef result = new NarrativeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}