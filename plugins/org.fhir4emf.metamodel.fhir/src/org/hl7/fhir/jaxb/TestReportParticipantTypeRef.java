package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportParticipantType;

@XmlRootElement(name = "TestReportParticipantTypeRefElement")
public class TestReportParticipantTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TestReportParticipantType createInstance() {
		return FhirFactory.eINSTANCE.createTestReportParticipantType();
	}
	
	public static TestReportParticipantTypeRef valueOf(String id) {
		TestReportParticipantTypeRef result = new TestReportParticipantTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}