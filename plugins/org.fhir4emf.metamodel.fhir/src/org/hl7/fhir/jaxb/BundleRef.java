package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Bundle;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleRefElement")
public class BundleRef extends org.hl7.fhir.jaxb.ResourceRef  {

	

	
	@Override
	public Bundle createInstance() {
		return FhirFactory.eINSTANCE.createBundle();
	}
	
	public static BundleRef valueOf(String id) {
		BundleRef result = new BundleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}