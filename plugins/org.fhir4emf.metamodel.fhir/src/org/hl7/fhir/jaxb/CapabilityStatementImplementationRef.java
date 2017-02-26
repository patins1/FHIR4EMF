package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementImplementation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementImplementationRefElement")
public class CapabilityStatementImplementationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementImplementation createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementImplementation();
	}
	
	public static CapabilityStatementImplementationRef valueOf(String id) {
		CapabilityStatementImplementationRef result = new CapabilityStatementImplementationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}