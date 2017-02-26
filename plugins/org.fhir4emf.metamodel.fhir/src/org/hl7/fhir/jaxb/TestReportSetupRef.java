package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportSetup;

@XmlRootElement(name = "TestReportSetupRefElement")
public class TestReportSetupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportSetup createInstance() {
		return FhirFactory.eINSTANCE.createTestReportSetup();
	}
	
	public static TestReportSetupRef valueOf(String id) {
		TestReportSetupRef result = new TestReportSetupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}