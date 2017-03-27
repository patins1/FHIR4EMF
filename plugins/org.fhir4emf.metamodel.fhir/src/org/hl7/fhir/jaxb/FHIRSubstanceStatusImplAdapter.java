package org.hl7.fhir.jaxb;

import org.hl7.fhir.FHIRSubstanceStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.FHIRSubstanceStatusList;
	
	
	
	

public class FHIRSubstanceStatusImplAdapter extends XmlAdapter<String, FHIRSubstanceStatus> {

	@Override
	public FHIRSubstanceStatus unmarshal(String v) throws Exception {
		FHIRSubstanceStatus result = FhirFactory.eINSTANCE.createFHIRSubstanceStatus();
		result.setValue(FHIRSubstanceStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(FHIRSubstanceStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
