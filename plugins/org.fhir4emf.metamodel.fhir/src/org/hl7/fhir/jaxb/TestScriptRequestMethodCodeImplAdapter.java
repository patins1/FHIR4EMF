package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TestScriptRequestMethodCode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TestScriptRequestMethodCodeList;
	
	
	
	

public class TestScriptRequestMethodCodeImplAdapter extends XmlAdapter<String, TestScriptRequestMethodCode> {

	@Override
	public TestScriptRequestMethodCode unmarshal(String v) throws Exception {
		TestScriptRequestMethodCode result = FhirFactory.eINSTANCE.createTestScriptRequestMethodCode();
		result.setValue(TestScriptRequestMethodCodeList.get(v));
		return result;
	}

	@Override
	public String marshal(TestScriptRequestMethodCode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
