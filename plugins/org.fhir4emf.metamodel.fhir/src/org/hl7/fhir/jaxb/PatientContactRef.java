package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PatientContact;

@XmlRootElement(name = "PatientContactRefElement")
public class PatientContactRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PatientContact createInstance() {
		return FhirFactory.eINSTANCE.createPatientContact();
	}
	
	public static PatientContactRef valueOf(String id) {
		PatientContactRef result = new PatientContactRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}