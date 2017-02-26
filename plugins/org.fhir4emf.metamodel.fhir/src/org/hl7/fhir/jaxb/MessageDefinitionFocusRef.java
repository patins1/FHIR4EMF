package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.MessageDefinitionFocus;

@XmlRootElement(name = "MessageDefinitionFocusRefElement")
public class MessageDefinitionFocusRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public MessageDefinitionFocus createInstance() {
		return FhirFactory.eINSTANCE.createMessageDefinitionFocus();
	}
	
	public static MessageDefinitionFocusRef valueOf(String id) {
		MessageDefinitionFocusRef result = new MessageDefinitionFocusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}