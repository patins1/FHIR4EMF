package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptAssert;

@XmlRootElement(name = "TestScriptAssertRefElement")
public class TestScriptAssertRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptAssert createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptAssert();
	}
	
	public static TestScriptAssertRef valueOf(String id) {
		TestScriptAssertRef result = new TestScriptAssertRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}