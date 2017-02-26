package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportParticipantType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TestReportParticipantTypeList;
	
	
	
	

public class TestReportParticipantTypeImplAdapter extends XmlAdapter<String, TestReportParticipantType> {

	@Override
	public TestReportParticipantType unmarshal(String v) throws Exception {
		TestReportParticipantType result = FhirFactory.eINSTANCE.createTestReportParticipantType();
		result.setValue(TestReportParticipantTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(TestReportParticipantType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
