package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationAdministrationStatus;

@XmlRootElement(name = "MedicationAdministrationStatusRefElement")
public class MedicationAdministrationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationAdministrationStatus createInstance() {
		return FhirFactory.eINSTANCE.createMedicationAdministrationStatus();
	}
	
	public static MedicationAdministrationStatusRef valueOf(String id) {
		MedicationAdministrationStatusRef result = new MedicationAdministrationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}