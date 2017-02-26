package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptAction1;

@XmlRootElement(name = "TestScriptAction1RefElement")
public class TestScriptAction1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptAction1 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptAction1();
	}
	
	public static TestScriptAction1Ref valueOf(String id) {
		TestScriptAction1Ref result = new TestScriptAction1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}