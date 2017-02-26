package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterHospitalization;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterHospitalizationRefElement")
public class EncounterHospitalizationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterHospitalization createInstance() {
		return FhirFactory.eINSTANCE.createEncounterHospitalization();
	}
	
	public static EncounterHospitalizationRef valueOf(String id) {
		EncounterHospitalizationRef result = new EncounterHospitalizationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}