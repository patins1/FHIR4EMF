package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ResourceTypeList;
	
	
	
	

public class ResourceTypeImplAdapter extends XmlAdapter<String, ResourceType> {

	@Override
	public ResourceType unmarshal(String v) throws Exception {
		ResourceType result = FhirFactory.eINSTANCE.createResourceType();
		result.setValue(ResourceTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ResourceType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
