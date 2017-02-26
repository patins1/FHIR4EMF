package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestPriority;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationRequestPriorityList;
	
	
	
	

public class MedicationRequestPriorityImplAdapter extends XmlAdapter<String, MedicationRequestPriority> {

	@Override
	public MedicationRequestPriority unmarshal(String v) throws Exception {
		MedicationRequestPriority result = FhirFactory.eINSTANCE.createMedicationRequestPriority();
		result.setValue(MedicationRequestPriorityList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationRequestPriority v) throws Exception {
		return v.getValue().getLiteral();
	}

}
