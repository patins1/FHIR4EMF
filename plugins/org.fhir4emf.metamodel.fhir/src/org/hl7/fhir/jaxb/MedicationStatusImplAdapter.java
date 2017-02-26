package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationStatusList;
	
	
	
	

public class MedicationStatusImplAdapter extends XmlAdapter<String, MedicationStatus> {

	@Override
	public MedicationStatus unmarshal(String v) throws Exception {
		MedicationStatus result = FhirFactory.eINSTANCE.createMedicationStatus();
		result.setValue(MedicationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
