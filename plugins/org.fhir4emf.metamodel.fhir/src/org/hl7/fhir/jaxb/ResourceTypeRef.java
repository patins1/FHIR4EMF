package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceType;

@XmlRootElement(name = "ResourceTypeRefElement")
public class ResourceTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ResourceType createInstance() {
		return FhirFactory.eINSTANCE.createResourceType();
	}
	
	public static ResourceTypeRef valueOf(String id) {
		ResourceTypeRef result = new ResourceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}