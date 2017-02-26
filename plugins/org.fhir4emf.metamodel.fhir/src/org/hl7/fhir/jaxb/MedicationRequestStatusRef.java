package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestStatus;

@XmlRootElement(name = "MedicationRequestStatusRefElement")
public class MedicationRequestStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationRequestStatus createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequestStatus();
	}
	
	public static MedicationRequestStatusRef valueOf(String id) {
		MedicationRequestStatusRef result = new MedicationRequestStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}