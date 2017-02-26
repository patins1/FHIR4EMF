package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Catalog;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CatalogRefElement")
public class CatalogRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Catalog createInstance() {
		return FhirFactory.eINSTANCE.createCatalog();
	}
	
	public static CatalogRef valueOf(String id) {
		CatalogRef result = new CatalogRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}