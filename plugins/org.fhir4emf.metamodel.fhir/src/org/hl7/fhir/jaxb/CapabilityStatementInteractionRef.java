package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementInteraction;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementInteractionRefElement")
public class CapabilityStatementInteractionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementInteraction createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementInteraction();
	}
	
	public static CapabilityStatementInteractionRef valueOf(String id) {
		CapabilityStatementInteractionRef result = new CapabilityStatementInteractionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}