package org.hl7.fhir.jaxb;

import org.hl7.fhir.AssertionResponseTypes;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AssertionResponseTypesList;
	
	
	
	

public class AssertionResponseTypesImplAdapter extends XmlAdapter<String, AssertionResponseTypes> {

	@Override
	public AssertionResponseTypes unmarshal(String v) throws Exception {
		AssertionResponseTypes result = FhirFactory.eINSTANCE.createAssertionResponseTypes();
		result.setValue(AssertionResponseTypesList.get(v));
		return result;
	}

	@Override
	public String marshal(AssertionResponseTypes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
