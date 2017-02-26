package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EnrollmentResponseRefElement")
public class EnrollmentResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public EnrollmentResponse createInstance() {
		return FhirFactory.eINSTANCE.createEnrollmentResponse();
	}
	
	public static EnrollmentResponseRef valueOf(String id) {
		EnrollmentResponseRef result = new EnrollmentResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}