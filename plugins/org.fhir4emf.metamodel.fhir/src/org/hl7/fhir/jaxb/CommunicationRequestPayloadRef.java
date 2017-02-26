package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CommunicationRequestPayload;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CommunicationRequestPayloadRefElement")
public class CommunicationRequestPayloadRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CommunicationRequestPayload createInstance() {
		return FhirFactory.eINSTANCE.createCommunicationRequestPayload();
	}
	
	public static CommunicationRequestPayloadRef valueOf(String id) {
		CommunicationRequestPayloadRef result = new CommunicationRequestPayloadRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}