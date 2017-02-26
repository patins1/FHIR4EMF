package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PractitionerQualification;

@XmlRootElement(name = "PractitionerQualificationRefElement")
public class PractitionerQualificationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PractitionerQualification createInstance() {
		return FhirFactory.eINSTANCE.createPractitionerQualification();
	}
	
	public static PractitionerQualificationRef valueOf(String id) {
		PractitionerQualificationRef result = new PractitionerQualificationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}