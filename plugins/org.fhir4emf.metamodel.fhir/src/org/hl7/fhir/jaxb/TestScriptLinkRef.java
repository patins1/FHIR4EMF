package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptLink;

@XmlRootElement(name = "TestScriptLinkRefElement")
public class TestScriptLinkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptLink createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptLink();
	}
	
	public static TestScriptLinkRef valueOf(String id) {
		TestScriptLinkRef result = new TestScriptLinkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}