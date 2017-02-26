package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Annotation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AnnotationRefElement")
public class AnnotationRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Annotation createInstance() {
		return FhirFactory.eINSTANCE.createAnnotation();
	}
	
	public static AnnotationRef valueOf(String id) {
		AnnotationRef result = new AnnotationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}