package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Patient;

@XmlRootElement(name = "PatientRefElement")
public class PatientRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Patient createInstance() {
		return FhirFactory.eINSTANCE.createPatient();
	}
	
	public static PatientRef valueOf(String id) {
		PatientRef result = new PatientRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}