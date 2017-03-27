package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestStatus;

@XmlRootElement(name = "RequestStatusRefElement")
public class RequestStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RequestStatus createInstance() {
		return FhirFactory.eINSTANCE.createRequestStatus();
	}
	
	public static RequestStatusRef valueOf(String id) {
		RequestStatusRef result = new RequestStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}