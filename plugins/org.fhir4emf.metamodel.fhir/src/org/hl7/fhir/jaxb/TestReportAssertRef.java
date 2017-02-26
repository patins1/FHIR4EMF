package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportAssert;

@XmlRootElement(name = "TestReportAssertRefElement")
public class TestReportAssertRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportAssert createInstance() {
		return FhirFactory.eINSTANCE.createTestReportAssert();
	}
	
	public static TestReportAssertRef valueOf(String id) {
		TestReportAssertRef result = new TestReportAssertRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}