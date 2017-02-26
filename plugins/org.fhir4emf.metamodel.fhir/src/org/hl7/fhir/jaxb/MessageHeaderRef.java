package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageHeader;

@XmlRootElement(name = "MessageHeaderRefElement")
public class MessageHeaderRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public MessageHeader createInstance() {
		return FhirFactory.eINSTANCE.createMessageHeader();
	}
	
	public static MessageHeaderRef valueOf(String id) {
		MessageHeaderRef result = new MessageHeaderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}