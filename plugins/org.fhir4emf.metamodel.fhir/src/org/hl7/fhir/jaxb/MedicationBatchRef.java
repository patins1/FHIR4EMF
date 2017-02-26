package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationBatch;

@XmlRootElement(name = "MedicationBatchRefElement")
public class MedicationBatchRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MedicationBatch createInstance() {
		return FhirFactory.eINSTANCE.createMedicationBatch();
	}
	
	public static MedicationBatchRef valueOf(String id) {
		MedicationBatchRef result = new MedicationBatchRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}