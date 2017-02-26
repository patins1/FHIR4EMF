package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptParam;

@XmlRootElement(name = "TestScriptParamRefElement")
public class TestScriptParamRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptParam createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptParam();
	}
	
	public static TestScriptParamRef valueOf(String id) {
		TestScriptParamRef result = new TestScriptParamRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}