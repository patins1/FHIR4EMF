package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DocumentRoot;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DocumentRootRefElement")
public class DocumentRootRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public DocumentRoot createInstance() {
		return FhirFactory.eINSTANCE.createDocumentRoot();
	}
	
	public static DocumentRootRef valueOf(String id) {
		DocumentRootRef result = new DocumentRootRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}