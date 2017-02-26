package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PatientLink;

@XmlRootElement(name = "PatientLinkRefElement")
public class PatientLinkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PatientLink createInstance() {
		return FhirFactory.eINSTANCE.createPatientLink();
	}
	
	public static PatientLinkRef valueOf(String id) {
		PatientLinkRef result = new PatientLinkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}