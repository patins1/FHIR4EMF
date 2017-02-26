package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MeasureReportStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MeasureReportStatusList;
	
	
	
	

public class MeasureReportStatusImplAdapter extends XmlAdapter<String, MeasureReportStatus> {

	@Override
	public MeasureReportStatus unmarshal(String v) throws Exception {
		MeasureReportStatus result = FhirFactory.eINSTANCE.createMeasureReportStatus();
		result.setValue(MeasureReportStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(MeasureReportStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
