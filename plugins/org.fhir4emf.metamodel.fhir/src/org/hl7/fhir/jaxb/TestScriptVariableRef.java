package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptVariable;

@XmlRootElement(name = "TestScriptVariableRefElement")
public class TestScriptVariableRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptVariable createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptVariable();
	}
	
	public static TestScriptVariableRef valueOf(String id) {
		TestScriptVariableRef result = new TestScriptVariableRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}