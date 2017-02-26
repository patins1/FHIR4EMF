package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationRequestStatusList;
	
	
	
	

public class MedicationRequestStatusImplAdapter extends XmlAdapter<String, MedicationRequestStatus> {

	@Override
	public MedicationRequestStatus unmarshal(String v) throws Exception {
		MedicationRequestStatus result = FhirFactory.eINSTANCE.createMedicationRequestStatus();
		result.setValue(MedicationRequestStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationRequestStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
