package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRule1;

@XmlRootElement(name = "TestScriptRule1RefElement")
public class TestScriptRule1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRule1 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRule1();
	}
	
	public static TestScriptRule1Ref valueOf(String id) {
		TestScriptRule1Ref result = new TestScriptRule1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}