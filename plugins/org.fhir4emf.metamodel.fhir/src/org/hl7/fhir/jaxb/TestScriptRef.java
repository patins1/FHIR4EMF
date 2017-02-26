package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScript;

@XmlRootElement(name = "TestScriptRefElement")
public class TestScriptRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public TestScript createInstance() {
		return FhirFactory.eINSTANCE.createTestScript();
	}
	
	public static TestScriptRef valueOf(String id) {
		TestScriptRef result = new TestScriptRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}