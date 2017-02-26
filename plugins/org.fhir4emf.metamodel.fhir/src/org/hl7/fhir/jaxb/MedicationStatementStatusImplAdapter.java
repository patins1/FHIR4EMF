package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatementStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationStatementStatusList;
	
	
	
	

public class MedicationStatementStatusImplAdapter extends XmlAdapter<String, MedicationStatementStatus> {

	@Override
	public MedicationStatementStatus unmarshal(String v) throws Exception {
		MedicationStatementStatus result = FhirFactory.eINSTANCE.createMedicationStatementStatus();
		result.setValue(MedicationStatementStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationStatementStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
