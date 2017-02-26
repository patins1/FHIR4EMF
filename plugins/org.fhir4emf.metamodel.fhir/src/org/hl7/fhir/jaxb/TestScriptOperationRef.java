package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptOperation;

@XmlRootElement(name = "TestScriptOperationRefElement")
public class TestScriptOperationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptOperation createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptOperation();
	}
	
	public static TestScriptOperationRef valueOf(String id) {
		TestScriptOperationRef result = new TestScriptOperationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}