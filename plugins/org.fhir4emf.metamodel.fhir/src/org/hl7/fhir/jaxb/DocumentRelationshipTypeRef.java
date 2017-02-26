package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentRelationshipType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentRelationshipTypeRefElement")
public class DocumentRelationshipTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public DocumentRelationshipType createInstance() {
		return FhirFactory.eINSTANCE.createDocumentRelationshipType();
	}
	
	public static DocumentRelationshipTypeRef valueOf(String id) {
		DocumentRelationshipTypeRef result = new DocumentRelationshipTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}