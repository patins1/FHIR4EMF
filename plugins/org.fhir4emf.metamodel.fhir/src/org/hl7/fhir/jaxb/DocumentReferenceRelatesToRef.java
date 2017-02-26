package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentReferenceRelatesTo;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentReferenceRelatesToRefElement")
public class DocumentReferenceRelatesToRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DocumentReferenceRelatesTo createInstance() {
		return FhirFactory.eINSTANCE.createDocumentReferenceRelatesTo();
	}
	
	public static DocumentReferenceRelatesToRef valueOf(String id) {
		DocumentReferenceRelatesToRef result = new DocumentReferenceRelatesToRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}