package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceVersionPolicy;

@XmlRootElement(name = "ResourceVersionPolicyRefElement")
public class ResourceVersionPolicyRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ResourceVersionPolicy createInstance() {
		return FhirFactory.eINSTANCE.createResourceVersionPolicy();
	}
	
	public static ResourceVersionPolicyRef valueOf(String id) {
		ResourceVersionPolicyRef result = new ResourceVersionPolicyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}