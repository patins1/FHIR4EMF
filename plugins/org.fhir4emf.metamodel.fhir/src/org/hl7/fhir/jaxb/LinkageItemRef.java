package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LinkageItem;

@XmlRootElement(name = "LinkageItemRefElement")
public class LinkageItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public LinkageItem createInstance() {
		return FhirFactory.eINSTANCE.createLinkageItem();
	}
	
	public static LinkageItemRef valueOf(String id) {
		LinkageItemRef result = new LinkageItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}