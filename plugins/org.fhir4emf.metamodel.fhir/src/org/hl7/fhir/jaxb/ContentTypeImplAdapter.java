package org.hl7.fhir.jaxb;

import org.hl7.fhir.ContentType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ContentTypeList;
	
	
	
	

public class ContentTypeImplAdapter extends XmlAdapter<String, ContentType> {

	@Override
	public ContentType unmarshal(String v) throws Exception {
		ContentType result = FhirFactory.eINSTANCE.createContentType();
		result.setValue(ContentTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ContentType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
