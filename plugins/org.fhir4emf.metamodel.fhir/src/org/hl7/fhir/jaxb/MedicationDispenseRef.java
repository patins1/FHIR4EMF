package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationDispense;

@XmlRootElement(name = "MedicationDispenseRefElement")
public class MedicationDispenseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MedicationDispense createInstance() {
		return FhirFactory.eINSTANCE.createMedicationDispense();
	}
	
	public static MedicationDispenseRef valueOf(String id) {
		MedicationDispenseRef result = new MedicationDispenseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}