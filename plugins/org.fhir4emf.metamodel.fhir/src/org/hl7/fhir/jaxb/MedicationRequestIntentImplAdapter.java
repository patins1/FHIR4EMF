package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationRequestIntent;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationRequestIntentList;
	
	
	
	

public class MedicationRequestIntentImplAdapter extends XmlAdapter<String, MedicationRequestIntent> {

	@Override
	public MedicationRequestIntent unmarshal(String v) throws Exception {
		MedicationRequestIntent result = FhirFactory.eINSTANCE.createMedicationRequestIntent();
		result.setValue(MedicationRequestIntentList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationRequestIntent v) throws Exception {
		return v.getValue().getLiteral();
	}

}
