package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptAction2;

@XmlRootElement(name = "TestScriptAction2RefElement")
public class TestScriptAction2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptAction2 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptAction2();
	}
	
	public static TestScriptAction2Ref valueOf(String id) {
		TestScriptAction2Ref result = new TestScriptAction2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}