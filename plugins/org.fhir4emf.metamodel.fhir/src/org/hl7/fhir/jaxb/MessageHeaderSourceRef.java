package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageHeaderSource;

@XmlRootElement(name = "MessageHeaderSourceRefElement")
public class MessageHeaderSourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MessageHeaderSource createInstance() {
		return FhirFactory.eINSTANCE.createMessageHeaderSource();
	}
	
	public static MessageHeaderSourceRef valueOf(String id) {
		MessageHeaderSourceRef result = new MessageHeaderSourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}