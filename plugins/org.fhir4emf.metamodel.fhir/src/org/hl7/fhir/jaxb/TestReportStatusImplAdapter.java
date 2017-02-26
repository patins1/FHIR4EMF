package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TestReportStatusList;
	
	
	
	

public class TestReportStatusImplAdapter extends XmlAdapter<String, TestReportStatus> {

	@Override
	public TestReportStatus unmarshal(String v) throws Exception {
		TestReportStatus result = FhirFactory.eINSTANCE.createTestReportStatus();
		result.setValue(TestReportStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(TestReportStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
