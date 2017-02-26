package org.hl7.fhir.jaxb;

import org.hl7.fhir.AssertionOperatorType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AssertionOperatorTypeList;
	
	
	
	

public class AssertionOperatorTypeImplAdapter extends XmlAdapter<String, AssertionOperatorType> {

	@Override
	public AssertionOperatorType unmarshal(String v) throws Exception {
		AssertionOperatorType result = FhirFactory.eINSTANCE.createAssertionOperatorType();
		result.setValue(AssertionOperatorTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(AssertionOperatorType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
