package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureScoring;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasureScoringList;
	
	
	
	

public class MeasureScoringImplAdapter extends XmlAdapter<String, MeasureScoring> {

	@Override
	public MeasureScoring unmarshal(String v) throws Exception {
		MeasureScoring result = FhirFactory.eINSTANCE.createMeasureScoring();
		result.setValue(MeasureScoringList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasureScoring v) throws Exception {
		return v.getValue().getLiteral();
	}

}
