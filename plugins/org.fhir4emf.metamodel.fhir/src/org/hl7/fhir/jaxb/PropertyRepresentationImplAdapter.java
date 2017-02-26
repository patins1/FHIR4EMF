package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PropertyRepresentation;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.PropertyRepresentationList;
	
	
	
	

public class PropertyRepresentationImplAdapter extends XmlAdapter<String, PropertyRepresentation> {

	@Override
	public PropertyRepresentation unmarshal(String v) throws Exception {
		PropertyRepresentation result = FhirFactory.eINSTANCE.createPropertyRepresentation();
		result.setValue(PropertyRepresentationList.get(v));
		return result;
	}

	@Override
	public String marshal(PropertyRepresentation v) throws Exception {
		return v.getValue().getLiteral();
	}

}
