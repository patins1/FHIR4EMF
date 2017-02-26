package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingManifestInstance;

@XmlRootElement(name = "ImagingManifestInstanceRefElement")
public class ImagingManifestInstanceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImagingManifestInstance createInstance() {
		return FhirFactory.eINSTANCE.createImagingManifestInstance();
	}
	
	public static ImagingManifestInstanceRef valueOf(String id) {
		ImagingManifestInstanceRef result = new ImagingManifestInstanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}