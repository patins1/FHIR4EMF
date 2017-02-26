package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationDispenseStatus;

@XmlRootElement(name = "MedicationDispenseStatusRefElement")
public class MedicationDispenseStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationDispenseStatus createInstance() {
		return FhirFactory.eINSTANCE.createMedicationDispenseStatus();
	}
	
	public static MedicationDispenseStatusRef valueOf(String id) {
		MedicationDispenseStatusRef result = new MedicationDispenseStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}