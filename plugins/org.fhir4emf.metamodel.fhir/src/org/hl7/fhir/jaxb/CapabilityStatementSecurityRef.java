package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementSecurity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementSecurityRefElement")
public class CapabilityStatementSecurityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementSecurity createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementSecurity();
	}
	
	public static CapabilityStatementSecurityRef valueOf(String id) {
		CapabilityStatementSecurityRef result = new CapabilityStatementSecurityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}