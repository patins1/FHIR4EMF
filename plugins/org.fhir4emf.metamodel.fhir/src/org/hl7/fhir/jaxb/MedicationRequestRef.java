package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequest;

@XmlRootElement(name = "MedicationRequestRefElement")
public class MedicationRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MedicationRequest createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequest();
	}
	
	public static MedicationRequestRef valueOf(String id) {
		MedicationRequestRef result = new MedicationRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}