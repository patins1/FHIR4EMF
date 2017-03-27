package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RequestPriority;

@XmlRootElement(name = "RequestPriorityRefElement")
public class RequestPriorityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RequestPriority createInstance() {
		return FhirFactory.eINSTANCE.createRequestPriority();
	}
	
	public static RequestPriorityRef valueOf(String id) {
		RequestPriorityRef result = new RequestPriorityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}