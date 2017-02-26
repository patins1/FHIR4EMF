package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageHeaderDestination;

@XmlRootElement(name = "MessageHeaderDestinationRefElement")
public class MessageHeaderDestinationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MessageHeaderDestination createInstance() {
		return FhirFactory.eINSTANCE.createMessageHeaderDestination();
	}
	
	public static MessageHeaderDestinationRef valueOf(String id) {
		MessageHeaderDestinationRef result = new MessageHeaderDestinationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}