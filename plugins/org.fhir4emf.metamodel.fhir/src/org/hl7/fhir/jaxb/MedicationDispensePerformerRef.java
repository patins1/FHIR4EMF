package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationDispensePerformer;

@XmlRootElement(name = "MedicationDispensePerformerRefElement")
public class MedicationDispensePerformerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationDispensePerformer createInstance() {
		return FhirFactory.eINSTANCE.createMedicationDispensePerformer();
	}
	
	public static MedicationDispensePerformerRef valueOf(String id) {
		MedicationDispensePerformerRef result = new MedicationDispensePerformerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}