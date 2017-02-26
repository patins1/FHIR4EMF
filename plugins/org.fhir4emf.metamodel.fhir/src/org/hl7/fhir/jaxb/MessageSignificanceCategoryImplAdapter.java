package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageSignificanceCategory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.MessageSignificanceCategoryList;
	
	
	
	

public class MessageSignificanceCategoryImplAdapter extends XmlAdapter<String, MessageSignificanceCategory> {

	@Override
	public MessageSignificanceCategory unmarshal(String v) throws Exception {
		MessageSignificanceCategory result = FhirFactory.eINSTANCE.createMessageSignificanceCategory();
		result.setValue(MessageSignificanceCategoryList.get(v));
		return result;
	}

	@Override
	public String marshal(MessageSignificanceCategory v) throws Exception {
		return v.getValue().getLiteral();
	}

}
