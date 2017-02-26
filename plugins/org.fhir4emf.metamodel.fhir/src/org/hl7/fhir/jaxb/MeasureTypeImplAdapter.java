package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasureTypeList;
	
	
	
	

public class MeasureTypeImplAdapter extends XmlAdapter<String, MeasureType> {

	@Override
	public MeasureType unmarshal(String v) throws Exception {
		MeasureType result = FhirFactory.eINSTANCE.createMeasureType();
		result.setValue(MeasureTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasureType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
