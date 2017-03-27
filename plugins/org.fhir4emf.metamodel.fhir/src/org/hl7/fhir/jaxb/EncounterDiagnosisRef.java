package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EncounterDiagnosis;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EncounterDiagnosisRefElement")
public class EncounterDiagnosisRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public EncounterDiagnosis createInstance() {
		return FhirFactory.eINSTANCE.createEncounterDiagnosis();
	}
	
	public static EncounterDiagnosisRef valueOf(String id) {
		EncounterDiagnosisRef result = new EncounterDiagnosisRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}