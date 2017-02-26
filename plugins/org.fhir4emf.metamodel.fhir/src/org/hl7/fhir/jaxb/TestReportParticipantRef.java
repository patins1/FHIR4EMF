package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportParticipant;

@XmlRootElement(name = "TestReportParticipantRefElement")
public class TestReportParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportParticipant createInstance() {
		return FhirFactory.eINSTANCE.createTestReportParticipant();
	}
	
	public static TestReportParticipantRef valueOf(String id) {
		TestReportParticipantRef result = new TestReportParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}