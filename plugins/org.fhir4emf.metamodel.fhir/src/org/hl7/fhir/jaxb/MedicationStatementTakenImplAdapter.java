package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatementTaken;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationStatementTakenList;
	
	
	
	

public class MedicationStatementTakenImplAdapter extends XmlAdapter<String, MedicationStatementTaken> {

	@Override
	public MedicationStatementTaken unmarshal(String v) throws Exception {
		MedicationStatementTaken result = FhirFactory.eINSTANCE.createMedicationStatementTaken();
		result.setValue(MedicationStatementTakenList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationStatementTaken v) throws Exception {
		return v.getValue().getLiteral();
	}

}
