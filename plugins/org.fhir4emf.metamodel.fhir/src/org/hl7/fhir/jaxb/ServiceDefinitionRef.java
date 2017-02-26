package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ServiceDefinition;

@XmlRootElement(name = "ServiceDefinitionRefElement")
public class ServiceDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ServiceDefinition createInstance() {
		return FhirFactory.eINSTANCE.createServiceDefinition();
	}
	
	public static ServiceDefinitionRef valueOf(String id) {
		ServiceDefinitionRef result = new ServiceDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}