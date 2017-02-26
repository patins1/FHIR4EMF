package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CatalogDocument;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CatalogDocumentRefElement")
public class CatalogDocumentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CatalogDocument createInstance() {
		return FhirFactory.eINSTANCE.createCatalogDocument();
	}
	
	public static CatalogDocumentRef valueOf(String id) {
		CatalogDocumentRef result = new CatalogDocumentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}