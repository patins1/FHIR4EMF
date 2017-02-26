package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageHeaderResponse;

@XmlRootElement(name = "MessageHeaderResponseRefElement")
public class MessageHeaderResponseRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MessageHeaderResponse createInstance() {
		return FhirFactory.eINSTANCE.createMessageHeaderResponse();
	}
	
	public static MessageHeaderResponseRef valueOf(String id) {
		MessageHeaderResponseRef result = new MessageHeaderResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}