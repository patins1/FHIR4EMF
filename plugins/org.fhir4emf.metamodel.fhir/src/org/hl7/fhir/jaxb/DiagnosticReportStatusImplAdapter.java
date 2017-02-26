package org.hl7.fhir.jaxb;

import org.hl7.fhir.DiagnosticReportStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DiagnosticReportStatusList;
	
	
	
	

public class DiagnosticReportStatusImplAdapter extends XmlAdapter<String, DiagnosticReportStatus> {

	@Override
	public DiagnosticReportStatus unmarshal(String v) throws Exception {
		DiagnosticReportStatus result = FhirFactory.eINSTANCE.createDiagnosticReportStatus();
		result.setValue(DiagnosticReportStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(DiagnosticReportStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
