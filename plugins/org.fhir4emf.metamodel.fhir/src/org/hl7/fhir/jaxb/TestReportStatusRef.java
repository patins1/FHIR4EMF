package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportStatus;

@XmlRootElement(name = "TestReportStatusRefElement")
public class TestReportStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TestReportStatus createInstance() {
		return FhirFactory.eINSTANCE.createTestReportStatus();
	}
	
	public static TestReportStatusRef valueOf(String id) {
		TestReportStatusRef result = new TestReportStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}