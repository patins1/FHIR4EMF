package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReferenceStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceStatusRefElement")
public class DocumentReferenceStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DocumentReferenceStatus createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReferenceStatus();
	}
	
	public static DocumentReferenceStatusRef valueOf(String id) {
		DocumentReferenceStatusRef result = new DocumentReferenceStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}