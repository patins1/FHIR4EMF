package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LinkageType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.LinkageTypeList;
	
	
	
	

public class LinkageTypeImplAdapter extends XmlAdapter<String, LinkageType> {

	@Override
	public LinkageType unmarshal(String v) throws Exception {
		LinkageType result = FhirFactory.eINSTANCE.createLinkageType();
		result.setValue(LinkageTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(LinkageType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
