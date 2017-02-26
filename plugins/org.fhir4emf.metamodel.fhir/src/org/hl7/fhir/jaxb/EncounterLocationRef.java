package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterLocation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterLocationRefElement")
public class EncounterLocationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterLocation createInstance() {
		return FhirFactory.eINSTANCE.createEncounterLocation();
	}
	
	public static EncounterLocationRef valueOf(String id) {
		EncounterLocationRef result = new EncounterLocationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}