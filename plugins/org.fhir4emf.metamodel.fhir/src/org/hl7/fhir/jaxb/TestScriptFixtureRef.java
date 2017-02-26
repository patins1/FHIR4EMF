package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptFixture;

@XmlRootElement(name = "TestScriptFixtureRefElement")
public class TestScriptFixtureRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptFixture createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptFixture();
	}
	
	public static TestScriptFixtureRef valueOf(String id) {
		TestScriptFixtureRef result = new TestScriptFixtureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}