package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasureReportTypeList;
	
	
	
	

public class MeasureReportTypeImplAdapter extends XmlAdapter<String, MeasureReportType> {

	@Override
	public MeasureReportType unmarshal(String v) throws Exception {
		MeasureReportType result = FhirFactory.eINSTANCE.createMeasureReportType();
		result.setValue(MeasureReportTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasureReportType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
