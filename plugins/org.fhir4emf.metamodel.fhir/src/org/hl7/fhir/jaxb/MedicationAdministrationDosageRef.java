package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationAdministrationDosage;

@XmlRootElement(name = "MedicationAdministrationDosageRefElement")
public class MedicationAdministrationDosageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationAdministrationDosage createInstance() {
		return FhirFactory.eINSTANCE.createMedicationAdministrationDosage();
	}
	
	public static MedicationAdministrationDosageRef valueOf(String id) {
		MedicationAdministrationDosageRef result = new MedicationAdministrationDosageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}