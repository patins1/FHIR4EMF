package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceVersionPolicy;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ResourceVersionPolicyList;
	
	
	
	

public class ResourceVersionPolicyImplAdapter extends XmlAdapter<String, ResourceVersionPolicy> {

	@Override
	public ResourceVersionPolicy unmarshal(String v) throws Exception {
		ResourceVersionPolicy result = FhirFactory.eINSTANCE.createResourceVersionPolicy();
		result.setValue(ResourceVersionPolicyList.get(v));
		return result;
	}

	@Override
	public String marshal(ResourceVersionPolicy v) throws Exception {
		return v.getValue().getLiteral();
	}

}
