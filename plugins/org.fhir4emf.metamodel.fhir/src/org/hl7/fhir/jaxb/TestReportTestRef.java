package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportTest;

@XmlRootElement(name = "TestReportTestRefElement")
public class TestReportTestRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportTest createInstance() {
		return FhirFactory.eINSTANCE.createTestReportTest();
	}
	
	public static TestReportTestRef valueOf(String id) {
		TestReportTestRef result = new TestReportTestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}