package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.BundleSearch;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "BundleSearchRefElement")
public class BundleSearchRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public BundleSearch createInstance() {
		return FhirFactory.eINSTANCE.createBundleSearch();
	}
	
	public static BundleSearchRef valueOf(String id) {
		BundleSearchRef result = new BundleSearchRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}