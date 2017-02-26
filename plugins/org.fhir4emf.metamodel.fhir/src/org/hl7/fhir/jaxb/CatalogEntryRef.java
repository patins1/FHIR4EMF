package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CatalogEntry;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CatalogEntryRefElement")
public class CatalogEntryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CatalogEntry createInstance() {
		return FhirFactory.eINSTANCE.createCatalogEntry();
	}
	
	public static CatalogEntryRef valueOf(String id) {
		CatalogEntryRef result = new CatalogEntryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}