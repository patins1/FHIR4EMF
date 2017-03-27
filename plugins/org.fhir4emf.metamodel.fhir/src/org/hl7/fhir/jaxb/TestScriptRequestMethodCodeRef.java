package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRequestMethodCode;

@XmlRootElement(name = "TestScriptRequestMethodCodeRefElement")
public class TestScriptRequestMethodCodeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TestScriptRequestMethodCode createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRequestMethodCode();
	}
	
	public static TestScriptRequestMethodCodeRef valueOf(String id) {
		TestScriptRequestMethodCodeRef result = new TestScriptRequestMethodCodeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}