package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementResource;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementResourceRefElement")
public class CapabilityStatementResourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementResource createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementResource();
	}
	
	public static CapabilityStatementResourceRef valueOf(String id) {
		CapabilityStatementResourceRef result = new CapabilityStatementResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}