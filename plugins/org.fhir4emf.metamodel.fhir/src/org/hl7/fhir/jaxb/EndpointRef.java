package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Endpoint;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "EndpointRefElement")
public class EndpointRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Endpoint createInstance() {
		return FhirFactory.eINSTANCE.createEndpoint();
	}
	
	public static EndpointRef valueOf(String id) {
		EndpointRef result = new EndpointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}