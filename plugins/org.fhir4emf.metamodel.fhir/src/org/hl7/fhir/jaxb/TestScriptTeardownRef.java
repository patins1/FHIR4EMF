package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptTeardown;

@XmlRootElement(name = "TestScriptTeardownRefElement")
public class TestScriptTeardownRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptTeardown createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptTeardown();
	}
	
	public static TestScriptTeardownRef valueOf(String id) {
		TestScriptTeardownRef result = new TestScriptTeardownRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}