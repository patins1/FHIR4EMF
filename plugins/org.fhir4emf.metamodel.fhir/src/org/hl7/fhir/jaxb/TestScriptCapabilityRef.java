package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptCapability;

@XmlRootElement(name = "TestScriptCapabilityRefElement")
public class TestScriptCapabilityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptCapability createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptCapability();
	}
	
	public static TestScriptCapabilityRef valueOf(String id) {
		TestScriptCapabilityRef result = new TestScriptCapabilityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}