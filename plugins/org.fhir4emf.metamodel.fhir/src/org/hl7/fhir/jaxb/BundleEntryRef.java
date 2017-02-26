package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleEntry;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleEntryRefElement")
public class BundleEntryRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public BundleEntry createInstance() {
		return FhirFactory.eINSTANCE.createBundleEntry();
	}
	
	public static BundleEntryRef valueOf(String id) {
		BundleEntryRef result = new BundleEntryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}