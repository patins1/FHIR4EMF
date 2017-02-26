package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleLink;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleLinkRefElement")
public class BundleLinkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public BundleLink createInstance() {
		return FhirFactory.eINSTANCE.createBundleLink();
	}
	
	public static BundleLinkRef valueOf(String id) {
		BundleLinkRef result = new BundleLinkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}