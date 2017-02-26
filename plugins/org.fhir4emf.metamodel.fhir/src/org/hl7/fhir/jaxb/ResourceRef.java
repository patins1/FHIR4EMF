package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Resource;

@XmlRootElement(name = "ResourceRefElement")
public class ResourceRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public Resource createInstance() {
		return FhirFactory.eINSTANCE.createResource();
	}
	
	public static ResourceRef valueOf(String id) {
		ResourceRef result = new ResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}