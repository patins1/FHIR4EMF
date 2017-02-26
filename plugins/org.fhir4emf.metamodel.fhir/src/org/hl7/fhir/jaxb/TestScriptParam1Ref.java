package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptParam1;

@XmlRootElement(name = "TestScriptParam1RefElement")
public class TestScriptParam1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptParam1 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptParam1();
	}
	
	public static TestScriptParam1Ref valueOf(String id) {
		TestScriptParam1Ref result = new TestScriptParam1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}