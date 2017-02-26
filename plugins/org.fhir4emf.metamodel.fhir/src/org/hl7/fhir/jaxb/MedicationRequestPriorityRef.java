package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestPriority;

@XmlRootElement(name = "MedicationRequestPriorityRefElement")
public class MedicationRequestPriorityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationRequestPriority createInstance() {
		return FhirFactory.eINSTANCE.createMedicationRequestPriority();
	}
	
	public static MedicationRequestPriorityRef valueOf(String id) {
		MedicationRequestPriorityRef result = new MedicationRequestPriorityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}