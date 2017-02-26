package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.DomainResource;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "DomainResourceRefElement")
public class DomainResourceRef extends org.hl7.fhir.jaxb.ResourceRef  {

	

	
	@Override
	public DomainResource createInstance() {
		return FhirFactory.eINSTANCE.createDomainResource();
	}
	
	public static DomainResourceRef valueOf(String id) {
		DomainResourceRef result = new DomainResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}