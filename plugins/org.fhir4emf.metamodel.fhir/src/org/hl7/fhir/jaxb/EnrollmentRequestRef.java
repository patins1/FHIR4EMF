package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EnrollmentRequestRefElement")
public class EnrollmentRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public EnrollmentRequest createInstance() {
		return FhirFactory.eINSTANCE.createEnrollmentRequest();
	}
	
	public static EnrollmentRequestRef valueOf(String id) {
		EnrollmentRequestRef result = new EnrollmentRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}