package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TypeRestfulInteraction;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TypeRestfulInteractionList;
	
	
	
	

public class TypeRestfulInteractionImplAdapter extends XmlAdapter<String, TypeRestfulInteraction> {

	@Override
	public TypeRestfulInteraction unmarshal(String v) throws Exception {
		TypeRestfulInteraction result = FhirFactory.eINSTANCE.createTypeRestfulInteraction();
		result.setValue(TypeRestfulInteractionList.get(v));
		return result;
	}

	@Override
	public String marshal(TypeRestfulInteraction v) throws Exception {
		return v.getValue().getLiteral();
	}

}
