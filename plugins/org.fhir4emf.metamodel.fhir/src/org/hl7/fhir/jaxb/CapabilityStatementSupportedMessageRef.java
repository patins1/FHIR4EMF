package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementSupportedMessage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementSupportedMessageRefElement")
public class CapabilityStatementSupportedMessageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementSupportedMessage createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementSupportedMessage();
	}
	
	public static CapabilityStatementSupportedMessageRef valueOf(String id) {
		CapabilityStatementSupportedMessageRef result = new CapabilityStatementSupportedMessageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}