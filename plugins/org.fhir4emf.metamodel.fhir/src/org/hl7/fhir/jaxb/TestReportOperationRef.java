package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportOperation;

@XmlRootElement(name = "TestReportOperationRefElement")
public class TestReportOperationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportOperation createInstance() {
		return FhirFactory.eINSTANCE.createTestReportOperation();
	}
	
	public static TestReportOperationRef valueOf(String id) {
		TestReportOperationRef result = new TestReportOperationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}