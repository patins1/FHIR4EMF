package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterStatusRefElement")
public class EncounterStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EncounterStatus createInstance() {
		return FhirFactory.eINSTANCE.createEncounterStatus();
	}
	
	public static EncounterStatusRef valueOf(String id) {
		EncounterStatusRef result = new EncounterStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}