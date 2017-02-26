package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ImagingStudy;

@XmlRootElement(name = "ImagingStudyRefElement")
public class ImagingStudyRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ImagingStudy createInstance() {
		return FhirFactory.eINSTANCE.createImagingStudy();
	}
	
	public static ImagingStudyRef valueOf(String id) {
		ImagingStudyRef result = new ImagingStudyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}