package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PropertyType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.PropertyTypeList;
	
	
	
	

public class PropertyTypeImplAdapter extends XmlAdapter<String, PropertyType> {

	@Override
	public PropertyType unmarshal(String v) throws Exception {
		PropertyType result = FhirFactory.eINSTANCE.createPropertyType();
		result.setValue(PropertyTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(PropertyType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
