package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.EndpointStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EndpointStatusRefElement")
public class EndpointStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public EndpointStatus createInstance() {
		return FhirFactory.eINSTANCE.createEndpointStatus();
	}
	
	public static EndpointStatusRef valueOf(String id) {
		EndpointStatusRef result = new EndpointStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}