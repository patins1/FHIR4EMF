package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReport;

@XmlRootElement(name = "TestReportRefElement")
public class TestReportRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public TestReport createInstance() {
		return FhirFactory.eINSTANCE.createTestReport();
	}
	
	public static TestReportRef valueOf(String id) {
		TestReportRef result = new TestReportRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}