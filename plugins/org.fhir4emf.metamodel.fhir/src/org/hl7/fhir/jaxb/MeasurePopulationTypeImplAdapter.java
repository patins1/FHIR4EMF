package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasurePopulationType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasurePopulationTypeList;
	
	
	
	

public class MeasurePopulationTypeImplAdapter extends XmlAdapter<String, MeasurePopulationType> {

	@Override
	public MeasurePopulationType unmarshal(String v) throws Exception {
		MeasurePopulationType result = FhirFactory.eINSTANCE.createMeasurePopulationType();
		result.setValue(MeasurePopulationTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasurePopulationType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
