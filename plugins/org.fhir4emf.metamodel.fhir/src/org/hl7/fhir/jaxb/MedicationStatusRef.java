package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatus;

@XmlRootElement(name = "MedicationStatusRefElement")
public class MedicationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationStatus createInstance() {
		return FhirFactory.eINSTANCE.createMedicationStatus();
	}
	
	public static MedicationStatusRef valueOf(String id) {
		MedicationStatusRef result = new MedicationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}