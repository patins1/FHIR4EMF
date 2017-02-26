package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRuleset1;

@XmlRootElement(name = "TestScriptRuleset1RefElement")
public class TestScriptRuleset1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRuleset1 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRuleset1();
	}
	
	public static TestScriptRuleset1Ref valueOf(String id) {
		TestScriptRuleset1Ref result = new TestScriptRuleset1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}