package org.hl7.fhir.jaxb;

import org.hl7.fhir.AggregationMode;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AggregationModeList;
	
	
	
	

public class AggregationModeImplAdapter extends XmlAdapter<String, AggregationMode> {

	@Override
	public AggregationMode unmarshal(String v) throws Exception {
		AggregationMode result = FhirFactory.eINSTANCE.createAggregationMode();
		result.setValue(AggregationModeList.get(v));
		return result;
	}

	@Override
	public String marshal(AggregationMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
