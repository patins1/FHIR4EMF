package org.hl7.fhir.jaxb;

import org.hl7.fhir.CompartmentType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.CompartmentTypeList;
	
	
	
	

public class CompartmentTypeImplAdapter extends XmlAdapter<String, CompartmentType> {

	@Override
	public CompartmentType unmarshal(String v) throws Exception {
		CompartmentType result = FhirFactory.eINSTANCE.createCompartmentType();
		result.setValue(CompartmentTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(CompartmentType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
