package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRuleset;

@XmlRootElement(name = "TestScriptRulesetRefElement")
public class TestScriptRulesetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRuleset createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRuleset();
	}
	
	public static TestScriptRulesetRef valueOf(String id) {
		TestScriptRulesetRef result = new TestScriptRulesetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}