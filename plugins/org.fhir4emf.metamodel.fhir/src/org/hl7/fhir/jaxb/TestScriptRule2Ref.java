package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRule2;

@XmlRootElement(name = "TestScriptRule2RefElement")
public class TestScriptRule2Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptRule2 createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptRule2();
	}
	
	public static TestScriptRule2Ref valueOf(String id) {
		TestScriptRule2Ref result = new TestScriptRule2Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}