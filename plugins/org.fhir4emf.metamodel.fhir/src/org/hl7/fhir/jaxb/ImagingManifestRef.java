package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingManifest;

@XmlRootElement(name = "ImagingManifestRefElement")
public class ImagingManifestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ImagingManifest createInstance() {
		return FhirFactory.eINSTANCE.createImagingManifest();
	}
	
	public static ImagingManifestRef valueOf(String id) {
		ImagingManifestRef result = new ImagingManifestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}