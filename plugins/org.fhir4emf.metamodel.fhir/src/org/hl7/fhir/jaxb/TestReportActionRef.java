package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestReportAction;

@XmlRootElement(name = "TestReportActionRefElement")
public class TestReportActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestReportAction createInstance() {
		return FhirFactory.eINSTANCE.createTestReportAction();
	}
	
	public static TestReportActionRef valueOf(String id) {
		TestReportActionRef result = new TestReportActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}