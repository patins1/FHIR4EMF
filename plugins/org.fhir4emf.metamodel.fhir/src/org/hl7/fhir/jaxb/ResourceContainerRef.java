package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceContainer;

@XmlRootElement(name = "ResourceContainerRefElement")
public class ResourceContainerRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public ResourceContainer createInstance() {
		return FhirFactory.eINSTANCE.createResourceContainer();
	}
	
	public static ResourceContainerRef valueOf(String id) {
		ResourceContainerRef result = new ResourceContainerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}