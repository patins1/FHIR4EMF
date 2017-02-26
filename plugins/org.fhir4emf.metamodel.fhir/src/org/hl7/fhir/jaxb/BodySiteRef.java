package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BodySite;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BodySiteRefElement")
public class BodySiteRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public BodySite createInstance() {
		return FhirFactory.eINSTANCE.createBodySite();
	}
	
	public static BodySiteRef valueOf(String id) {
		BodySiteRef result = new BodySiteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}