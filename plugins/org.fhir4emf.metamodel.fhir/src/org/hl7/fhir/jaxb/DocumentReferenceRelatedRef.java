package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReferenceRelated;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceRelatedRefElement")
public class DocumentReferenceRelatedRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DocumentReferenceRelated createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReferenceRelated();
	}
	
	public static DocumentReferenceRelatedRef valueOf(String id) {
		DocumentReferenceRelatedRef result = new DocumentReferenceRelatedRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}