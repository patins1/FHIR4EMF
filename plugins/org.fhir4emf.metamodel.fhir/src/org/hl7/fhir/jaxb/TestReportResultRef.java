package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportResult;

@XmlRootElement(name = "TestReportResultRefElement")
public class TestReportResultRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TestReportResult createInstance() {
		return FhirFactory.eINSTANCE.createTestReportResult();
	}
	
	public static TestReportResultRef valueOf(String id) {
		TestReportResultRef result = new TestReportResultRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}