package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Medication;

@XmlRootElement(name = "MedicationRefElement")
public class MedicationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Medication createInstance() {
		return FhirFactory.eINSTANCE.createMedication();
	}
	
	public static MedicationRef valueOf(String id) {
		MedicationRef result = new MedicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}