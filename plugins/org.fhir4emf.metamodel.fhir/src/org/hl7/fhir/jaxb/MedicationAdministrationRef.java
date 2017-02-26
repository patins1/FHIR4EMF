package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationAdministration;

@XmlRootElement(name = "MedicationAdministrationRefElement")
public class MedicationAdministrationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MedicationAdministration createInstance() {
		return FhirFactory.eINSTANCE.createMedicationAdministration();
	}
	
	public static MedicationAdministrationRef valueOf(String id) {
		MedicationAdministrationRef result = new MedicationAdministrationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}