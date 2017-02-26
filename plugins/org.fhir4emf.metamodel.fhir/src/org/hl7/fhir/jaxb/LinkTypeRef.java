package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.LinkType;

@XmlRootElement(name = "LinkTypeRefElement")
public class LinkTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public LinkType createInstance() {
		return FhirFactory.eINSTANCE.createLinkType();
	}
	
	public static LinkTypeRef valueOf(String id) {
		LinkTypeRef result = new LinkTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}