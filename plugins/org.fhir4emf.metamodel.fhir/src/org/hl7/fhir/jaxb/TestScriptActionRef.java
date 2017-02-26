package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptAction;

@XmlRootElement(name = "TestScriptActionRefElement")
public class TestScriptActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptAction createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptAction();
	}
	
	public static TestScriptActionRef valueOf(String id) {
		TestScriptActionRef result = new TestScriptActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}