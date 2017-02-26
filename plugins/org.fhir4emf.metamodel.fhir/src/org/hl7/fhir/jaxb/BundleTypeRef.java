package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleTypeRefElement")
public class BundleTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public BundleType createInstance() {
		return FhirFactory.eINSTANCE.createBundleType();
	}
	
	public static BundleTypeRef valueOf(String id) {
		BundleTypeRef result = new BundleTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}