package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReferenceContent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceContentRefElement")
public class DocumentReferenceContentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DocumentReferenceContent createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReferenceContent();
	}
	
	public static DocumentReferenceContentRef valueOf(String id) {
		DocumentReferenceContentRef result = new DocumentReferenceContentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}