package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentManifestContent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentManifestContentRefElement")
public class DocumentManifestContentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public DocumentManifestContent createInstance() {
		return FhirFactory.eINSTANCE.createDocumentManifestContent();
	}
	
	public static DocumentManifestContentRef valueOf(String id) {
		DocumentManifestContentRef result = new DocumentManifestContentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}