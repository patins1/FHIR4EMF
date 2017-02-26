package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementEvent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementEventRefElement")
public class CapabilityStatementEventRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementEvent createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementEvent();
	}
	
	public static CapabilityStatementEventRef valueOf(String id) {
		CapabilityStatementEventRef result = new CapabilityStatementEventRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}