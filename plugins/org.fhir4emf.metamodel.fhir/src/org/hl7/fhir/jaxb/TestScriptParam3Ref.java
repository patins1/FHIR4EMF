package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptParam3;

@XmlRootElement(name = "TestScriptParam3RefElement")
public class TestScriptParam3Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptParam3 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptParam3();
	}
	
	public static TestScriptParam3Ref valueOf(String id) {
		TestScriptParam3Ref result = new TestScriptParam3Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}