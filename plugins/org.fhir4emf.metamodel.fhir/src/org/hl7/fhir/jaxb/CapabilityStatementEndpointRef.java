package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementEndpoint;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementEndpointRefElement")
public class CapabilityStatementEndpointRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementEndpoint createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementEndpoint();
	}
	
	public static CapabilityStatementEndpointRef valueOf(String id) {
		CapabilityStatementEndpointRef result = new CapabilityStatementEndpointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}