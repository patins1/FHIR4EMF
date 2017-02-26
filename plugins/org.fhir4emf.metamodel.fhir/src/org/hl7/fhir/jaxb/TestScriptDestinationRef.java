package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptDestination;

@XmlRootElement(name = "TestScriptDestinationRefElement")
public class TestScriptDestinationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptDestination createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptDestination();
	}
	
	public static TestScriptDestinationRef valueOf(String id) {
		TestScriptDestinationRef result = new TestScriptDestinationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}