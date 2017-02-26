package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageDefinitionAllowedResponse;

@XmlRootElement(name = "MessageDefinitionAllowedResponseRefElement")
public class MessageDefinitionAllowedResponseRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MessageDefinitionAllowedResponse createInstance() {
		return FhirFactory.eINSTANCE.createMessageDefinitionAllowedResponse();
	}
	
	public static MessageDefinitionAllowedResponseRef valueOf(String id) {
		MessageDefinitionAllowedResponseRef result = new MessageDefinitionAllowedResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}