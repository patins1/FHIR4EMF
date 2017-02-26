package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Encounter;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterRefElement")
public class EncounterRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Encounter createInstance() {
		return FhirFactory.eINSTANCE.createEncounter();
	}
	
	public static EncounterRef valueOf(String id) {
		EncounterRef result = new EncounterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}