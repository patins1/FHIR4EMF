package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageDefinition;

@XmlRootElement(name = "MessageDefinitionRefElement")
public class MessageDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MessageDefinition createInstance() {
		return FhirFactory.eINSTANCE.createMessageDefinition();
	}
	
	public static MessageDefinitionRef valueOf(String id) {
		MessageDefinitionRef result = new MessageDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}