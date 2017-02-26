package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatement;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementRefElement")
public class CapabilityStatementRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CapabilityStatement createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatement();
	}
	
	public static CapabilityStatementRef valueOf(String id) {
		CapabilityStatementRef result = new CapabilityStatementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}