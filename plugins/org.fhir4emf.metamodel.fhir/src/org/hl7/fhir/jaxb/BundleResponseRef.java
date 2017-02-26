package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleResponse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleResponseRefElement")
public class BundleResponseRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public BundleResponse createInstance() {
		return FhirFactory.eINSTANCE.createBundleResponse();
	}
	
	public static BundleResponseRef valueOf(String id) {
		BundleResponseRef result = new BundleResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}