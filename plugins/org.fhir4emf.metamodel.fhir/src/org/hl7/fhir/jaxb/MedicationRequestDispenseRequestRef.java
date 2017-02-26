package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestDispenseRequest;

@XmlRootElement(name = "MedicationRequestDispenseRequestRefElement")
public class MedicationRequestDispenseRequestRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationRequestDispenseRequest createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequestDispenseRequest();
	}
	
	public static MedicationRequestDispenseRequestRef valueOf(String id) {
		MedicationRequestDispenseRequestRef result = new MedicationRequestDispenseRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}