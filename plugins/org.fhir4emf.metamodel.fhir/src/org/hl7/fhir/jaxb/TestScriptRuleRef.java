package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRule;

@XmlRootElement(name = "TestScriptRuleRefElement")
public class TestScriptRuleRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRule createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRule();
	}
	
	public static TestScriptRuleRef valueOf(String id) {
		TestScriptRuleRef result = new TestScriptRuleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}