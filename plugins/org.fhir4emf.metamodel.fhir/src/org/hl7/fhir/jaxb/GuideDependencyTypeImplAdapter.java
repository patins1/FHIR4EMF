package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuideDependencyType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GuideDependencyTypeList;
	
	
	
	

public class GuideDependencyTypeImplAdapter extends XmlAdapter<String, GuideDependencyType> {

	@Override
	public GuideDependencyType unmarshal(String v) throws Exception {
		GuideDependencyType result = FhirFactory.eINSTANCE.createGuideDependencyType();
		result.setValue(GuideDependencyTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(GuideDependencyType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
