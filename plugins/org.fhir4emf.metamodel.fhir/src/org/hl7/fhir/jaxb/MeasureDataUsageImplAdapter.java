package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureDataUsage;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasureDataUsageList;
	
	
	
	

public class MeasureDataUsageImplAdapter extends XmlAdapter<String, MeasureDataUsage> {

	@Override
	public MeasureDataUsage unmarshal(String v) throws Exception {
		MeasureDataUsage result = FhirFactory.eINSTANCE.createMeasureDataUsage();
		result.setValue(MeasureDataUsageList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasureDataUsage v) throws Exception {
		return v.getValue().getLiteral();
	}

}
