package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatementStatus;

@XmlRootElement(name = "MedicationStatementStatusRefElement")
public class MedicationStatementStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public MedicationStatementStatus createInstance() {
		return FhirFactory.eINSTANCE.createMedicationStatementStatus();
	}
	
	public static MedicationStatementStatusRef valueOf(String id) {
		MedicationStatementStatusRef result = new MedicationStatementStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}