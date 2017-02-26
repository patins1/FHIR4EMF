package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRule3;

@XmlRootElement(name = "TestScriptRule3RefElement")
public class TestScriptRule3Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRule3 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRule3();
	}
	
	public static TestScriptRule3Ref valueOf(String id) {
		TestScriptRule3Ref result = new TestScriptRule3Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}