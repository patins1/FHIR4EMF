package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SpecimenStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SpecimenStatusList;
	
	
	
	

public class SpecimenStatusImplAdapter extends XmlAdapter<String, SpecimenStatus> {

	@Override
	public SpecimenStatus unmarshal(String v) throws Exception {
		SpecimenStatus result = FhirFactory.eINSTANCE.createSpecimenStatus();
		result.setValue(SpecimenStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(SpecimenStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
