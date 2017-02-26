package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatement;

@XmlRootElement(name = "MedicationStatementRefElement")
public class MedicationStatementRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MedicationStatement createInstance() {
		return FhirFactory.eINSTANCE.createMedicationStatement();
	}
	
	public static MedicationStatementRef valueOf(String id) {
		MedicationStatementRef result = new MedicationStatementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}