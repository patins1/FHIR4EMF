package org.hl7.fhir.jaxb;

import org.hl7.fhir.AssertionDirectionType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AssertionDirectionTypeList;
	
	
	
	

public class AssertionDirectionTypeImplAdapter extends XmlAdapter<String, AssertionDirectionType> {

	@Override
	public AssertionDirectionType unmarshal(String v) throws Exception {
		AssertionDirectionType result = FhirFactory.eINSTANCE.createAssertionDirectionType();
		result.setValue(AssertionDirectionTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(AssertionDirectionType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
