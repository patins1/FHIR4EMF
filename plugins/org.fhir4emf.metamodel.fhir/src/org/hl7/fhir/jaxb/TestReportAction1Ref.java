package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportAction1;

@XmlRootElement(name = "TestReportAction1RefElement")
public class TestReportAction1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportAction1 createInstance() {
		return FhirFactory.eINSTANCE.createTestReportAction1();
	}
	
	public static TestReportAction1Ref valueOf(String id) {
		TestReportAction1Ref result = new TestReportAction1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}