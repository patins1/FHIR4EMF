package org.hl7.fhir.jaxb;

import org.hl7.fhir.DiscriminatorType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DiscriminatorTypeList;
	
	
	
	

public class DiscriminatorTypeImplAdapter extends XmlAdapter<String, DiscriminatorType> {

	@Override
	public DiscriminatorType unmarshal(String v) throws Exception {
		DiscriminatorType result = FhirFactory.eINSTANCE.createDiscriminatorType();
		result.setValue(DiscriminatorTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(DiscriminatorType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
