package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MedicationAdministrationStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MedicationAdministrationStatusList;
	
	
	
	

public class MedicationAdministrationStatusImplAdapter extends XmlAdapter<String, MedicationAdministrationStatus> {

	@Override
	public MedicationAdministrationStatus unmarshal(String v) throws Exception {
		MedicationAdministrationStatus result = FhirFactory.eINSTANCE.createMedicationAdministrationStatus();
		result.setValue(MedicationAdministrationStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MedicationAdministrationStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
