package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptOrigin;

@XmlRootElement(name = "TestScriptOriginRefElement")
public class TestScriptOriginRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptOrigin createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptOrigin();
	}
	
	public static TestScriptOriginRef valueOf(String id) {
		TestScriptOriginRef result = new TestScriptOriginRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}