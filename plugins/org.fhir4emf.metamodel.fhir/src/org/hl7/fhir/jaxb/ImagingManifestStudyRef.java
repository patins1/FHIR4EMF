package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingManifestStudy;

@XmlRootElement(name = "ImagingManifestStudyRefElement")
public class ImagingManifestStudyRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImagingManifestStudy createInstance() {
		return FhirFactory.eINSTANCE.createImagingManifestStudy();
	}
	
	public static ImagingManifestStudyRef valueOf(String id) {
		ImagingManifestStudyRef result = new ImagingManifestStudyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}