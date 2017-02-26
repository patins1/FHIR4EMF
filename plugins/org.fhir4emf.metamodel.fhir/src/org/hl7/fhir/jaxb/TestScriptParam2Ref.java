package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptParam2;

@XmlRootElement(name = "TestScriptParam2RefElement")
public class TestScriptParam2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptParam2 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptParam2();
	}
	
	public static TestScriptParam2Ref valueOf(String id) {
		TestScriptParam2Ref result = new TestScriptParam2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}