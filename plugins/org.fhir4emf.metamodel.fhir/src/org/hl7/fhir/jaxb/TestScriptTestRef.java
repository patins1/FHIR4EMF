package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptTest;

@XmlRootElement(name = "TestScriptTestRefElement")
public class TestScriptTestRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptTest createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptTest();
	}
	
	public static TestScriptTestRef valueOf(String id) {
		TestScriptTestRef result = new TestScriptTestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}