package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContentType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContentTypeRefElement")
public class ContentTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContentType createInstance() {
		return FhirFactory.eINSTANCE.createContentType();
	}
	
	public static ContentTypeRef valueOf(String id) {
		ContentTypeRef result = new ContentTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}