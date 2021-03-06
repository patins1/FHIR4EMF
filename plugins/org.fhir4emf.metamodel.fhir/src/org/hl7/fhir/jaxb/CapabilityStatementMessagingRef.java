package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementMessaging;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementMessagingRefElement")
public class CapabilityStatementMessagingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementMessaging createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementMessaging();
	}
	
	public static CapabilityStatementMessagingRef valueOf(String id) {
		CapabilityStatementMessagingRef result = new CapabilityStatementMessagingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}