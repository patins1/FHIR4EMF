package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PatientCommunication;

@XmlRootElement(name = "PatientCommunicationRefElement")
public class PatientCommunicationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PatientCommunication createInstance() {
		return FhirFactory.eINSTANCE.createPatientCommunication();
	}
	
	public static PatientCommunicationRef valueOf(String id) {
		PatientCommunicationRef result = new PatientCommunicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}