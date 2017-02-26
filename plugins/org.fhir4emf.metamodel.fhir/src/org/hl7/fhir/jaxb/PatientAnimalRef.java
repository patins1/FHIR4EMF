package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PatientAnimal;

@XmlRootElement(name = "PatientAnimalRefElement")
public class PatientAnimalRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PatientAnimal createInstance() {
		return FhirFactory.eINSTANCE.createPatientAnimal();
	}
	
	public static PatientAnimalRef valueOf(String id) {
		PatientAnimalRef result = new PatientAnimalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}