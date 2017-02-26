package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LinkType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.LinkTypeList;
	
	
	
	

public class LinkTypeImplAdapter extends XmlAdapter<String, LinkType> {

	@Override
	public LinkType unmarshal(String v) throws Exception {
		LinkType result = FhirFactory.eINSTANCE.createLinkType();
		result.setValue(LinkTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(LinkType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
