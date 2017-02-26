package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportResult;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TestReportResultList;
	
	
	
	

public class TestReportResultImplAdapter extends XmlAdapter<String, TestReportResult> {

	@Override
	public TestReportResult unmarshal(String v) throws Exception {
		TestReportResult result = FhirFactory.eINSTANCE.createTestReportResult();
		result.setValue(TestReportResultList.get(v));
		return result;
	}

	@Override
	public String marshal(TestReportResult v) throws Exception {
		return v.getValue().getLiteral();
	}

}
