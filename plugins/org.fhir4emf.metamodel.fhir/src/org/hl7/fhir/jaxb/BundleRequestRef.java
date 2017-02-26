package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleRequest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleRequestRefElement")
public class BundleRequestRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public BundleRequest createInstance() {
		return FhirFactory.eINSTANCE.createBundleRequest();
	}
	
	public static BundleRequestRef valueOf(String id) {
		BundleRequestRef result = new BundleRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}