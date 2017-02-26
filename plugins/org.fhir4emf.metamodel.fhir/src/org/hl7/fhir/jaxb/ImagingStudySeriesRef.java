package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingStudySeries;

@XmlRootElement(name = "ImagingStudySeriesRefElement")
public class ImagingStudySeriesRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImagingStudySeries createInstance() {
		return FhirFactory.eINSTANCE.createImagingStudySeries();
	}
	
	public static ImagingStudySeriesRef valueOf(String id) {
		ImagingStudySeriesRef result = new ImagingStudySeriesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}