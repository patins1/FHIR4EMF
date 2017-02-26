package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportAction2;

@XmlRootElement(name = "TestReportAction2RefElement")
public class TestReportAction2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportAction2 createInstance() {
		return FhirFactory.eINSTANCE.createTestReportAction2();
	}
	
	public static TestReportAction2Ref valueOf(String id) {
		TestReportAction2Ref result = new TestReportAction2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}