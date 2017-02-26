package org.hl7.fhir.jaxb;

import org.hl7.fhir.FamilyHistoryStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FamilyHistoryStatusList;
	
	
	
	

public class FamilyHistoryStatusImplAdapter extends XmlAdapter<String, FamilyHistoryStatus> {

	@Override
	public FamilyHistoryStatus unmarshal(String v) throws Exception {
		FamilyHistoryStatus result = FhirFactory.eINSTANCE.createFamilyHistoryStatus();
		result.setValue(FamilyHistoryStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(FamilyHistoryStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
