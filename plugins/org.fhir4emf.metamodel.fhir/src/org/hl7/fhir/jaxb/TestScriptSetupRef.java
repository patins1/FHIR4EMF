package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptSetup;

@XmlRootElement(name = "TestScriptSetupRefElement")
public class TestScriptSetupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptSetup createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptSetup();
	}
	
	public static TestScriptSetupRef valueOf(String id) {
		TestScriptSetupRef result = new TestScriptSetupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}