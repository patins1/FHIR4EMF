package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptMetadata;

@XmlRootElement(name = "TestScriptMetadataRefElement")
public class TestScriptMetadataRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TestScriptMetadata createInstance() {
		return FhirFactory.eINSTANCE.createTestScriptMetadata();
	}
	
	public static TestScriptMetadataRef valueOf(String id) {
		TestScriptMetadataRef result = new TestScriptMetadataRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}