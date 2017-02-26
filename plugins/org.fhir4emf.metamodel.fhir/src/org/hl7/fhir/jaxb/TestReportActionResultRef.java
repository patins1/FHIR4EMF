package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportActionResult;

@XmlRootElement(name = "TestReportActionResultRefElement")
public class TestReportActionResultRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TestReportActionResult createInstance() {
		return FhirFactory.eINSTANCE.createTestReportActionResult();
	}
	
	public static TestReportActionResultRef valueOf(String id) {
		TestReportActionResultRef result = new TestReportActionResultRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}