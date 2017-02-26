package org.hl7.fhir.jaxb;

import org.hl7.fhir.CompositeMeasureScoring;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CompositeMeasureScoringList;
	
	
	
	

public class CompositeMeasureScoringImplAdapter extends XmlAdapter<String, CompositeMeasureScoring> {

	@Override
	public CompositeMeasureScoring unmarshal(String v) throws Exception {
		CompositeMeasureScoring result = FhirFactory.eINSTANCE.createCompositeMeasureScoring();
		result.setValue(CompositeMeasureScoringList.get(v));
		return result;
	}

	@Override
	public String marshal(CompositeMeasureScoring v) throws Exception {
		return v.getValue().getLiteral();
	}

}
