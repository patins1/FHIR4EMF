package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationDispenseStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationDispenseStatusList;
	
	
	
	

public class MedicationDispenseStatusImplAdapter extends XmlAdapter<String, MedicationDispenseStatus> {

	@Override
	public MedicationDispenseStatus unmarshal(String v) throws Exception {
		MedicationDispenseStatus result = FhirFactory.eINSTANCE.createMedicationDispenseStatus();
		result.setValue(MedicationDispenseStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationDispenseStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
