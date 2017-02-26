package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterLocationStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterLocationStatusRefElement")
public class EncounterLocationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EncounterLocationStatus createInstance() {
		return FhirFactory.eINSTANCE.createEncounterLocationStatus();
	}
	
	public static EncounterLocationStatusRef valueOf(String id) {
		EncounterLocationStatusRef result = new EncounterLocationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}