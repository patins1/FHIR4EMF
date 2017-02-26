package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingManifestSeries;

@XmlRootElement(name = "ImagingManifestSeriesRefElement")
public class ImagingManifestSeriesRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImagingManifestSeries createInstance() {
		return FhirFactory.eINSTANCE.createImagingManifestSeries();
	}
	
	public static ImagingManifestSeriesRef valueOf(String id) {
		ImagingManifestSeriesRef result = new ImagingManifestSeriesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}