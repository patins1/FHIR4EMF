package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReferenceContext;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceContextRefElement")
public class DocumentReferenceContextRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DocumentReferenceContext createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReferenceContext();
	}
	
	public static DocumentReferenceContextRef valueOf(String id) {
		DocumentReferenceContextRef result = new DocumentReferenceContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}