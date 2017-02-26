package org.hl7.fhir.jaxb;

import org.hl7.fhir.ClinicalImpressionStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ClinicalImpressionStatusList;
	
	
	
	

public class ClinicalImpressionStatusImplAdapter extends XmlAdapter<String, ClinicalImpressionStatus> {

	@Override
	public ClinicalImpressionStatus unmarshal(String v) throws Exception {
		ClinicalImpressionStatus result = FhirFactory.eINSTANCE.createClinicalImpressionStatus();
		result.setValue(ClinicalImpressionStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ClinicalImpressionStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
