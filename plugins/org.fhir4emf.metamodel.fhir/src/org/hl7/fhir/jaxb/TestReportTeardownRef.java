package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportTeardown;

@XmlRootElement(name = "TestReportTeardownRefElement")
public class TestReportTeardownRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportTeardown createInstance() {
		return FhirFactory.eINSTANCE.createTestReportTeardown();
	}
	
	public static TestReportTeardownRef valueOf(String id) {
		TestReportTeardownRef result = new TestReportTeardownRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}