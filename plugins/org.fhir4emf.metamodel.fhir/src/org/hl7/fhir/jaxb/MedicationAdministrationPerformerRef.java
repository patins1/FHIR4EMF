package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationAdministrationPerformer;

@XmlRootElement(name = "MedicationAdministrationPerformerRefElement")
public class MedicationAdministrationPerformerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationAdministrationPerformer createInstance() {
		return FhirFactory.eINSTANCE.createMedicationAdministrationPerformer();
	}
	
	public static MedicationAdministrationPerformerRef valueOf(String id) {
		MedicationAdministrationPerformerRef result = new MedicationAdministrationPerformerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}