package org.hl7.fhir.jaxb;

import org.hl7.fhir.CompositionStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CompositionStatusList;
	
	
	
	

public class CompositionStatusImplAdapter extends XmlAdapter<String, CompositionStatus> {

	@Override
	public CompositionStatus unmarshal(String v) throws Exception {
		CompositionStatus result = FhirFactory.eINSTANCE.createCompositionStatus();
		result.setValue(CompositionStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(CompositionStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
