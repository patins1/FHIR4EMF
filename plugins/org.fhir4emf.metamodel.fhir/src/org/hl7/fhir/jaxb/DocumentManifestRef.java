package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentManifestRefElement")
public class DocumentManifestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public DocumentManifest createInstance() {
		return FhirFactory.eINSTANCE.createDocumentManifest();
	}
	
	public static DocumentManifestRef valueOf(String id) {
		DocumentManifestRef result = new DocumentManifestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}