package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingStudyInstance;

@XmlRootElement(name = "ImagingStudyInstanceRefElement")
public class ImagingStudyInstanceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ImagingStudyInstance createInstance() {
		return FhirFactory.eINSTANCE.createImagingStudyInstance();
	}
	
	public static ImagingStudyInstanceRef valueOf(String id) {
		ImagingStudyInstanceRef result = new ImagingStudyInstanceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}