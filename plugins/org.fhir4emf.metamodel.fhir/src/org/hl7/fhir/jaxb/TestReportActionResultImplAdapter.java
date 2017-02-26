package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportActionResult;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TestReportActionResultList;
	
	
	
	

public class TestReportActionResultImplAdapter extends XmlAdapter<String, TestReportActionResult> {

	@Override
	public TestReportActionResult unmarshal(String v) throws Exception {
		TestReportActionResult result = FhirFactory.eINSTANCE.createTestReportActionResult();
		result.setValue(TestReportActionResultList.get(v));
		return result;
	}

	@Override
	public String marshal(TestReportActionResult v) throws Exception {
		return v.getValue().getLiteral();
	}

}
