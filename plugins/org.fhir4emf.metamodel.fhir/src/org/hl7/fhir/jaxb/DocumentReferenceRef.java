package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceRefElement")
public class DocumentReferenceRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DocumentReference createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReference();
	}
	
	public static DocumentReferenceRef valueOf(String id) {
		DocumentReferenceRef result = new DocumentReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}