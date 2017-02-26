package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CatalogRelatedItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CatalogRelatedItemRefElement")
public class CatalogRelatedItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CatalogRelatedItem createInstance() {
		return FhirFactory.eINSTANCE.createCatalogRelatedItem();
	}
	
	public static CatalogRelatedItemRef valueOf(String id) {
		CatalogRelatedItemRef result = new CatalogRelatedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}