package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CommunicationPayload;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CommunicationPayloadRefElement")
public class CommunicationPayloadRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CommunicationPayload createInstance() {
		return FhirFactory.eINSTANCE.createCommunicationPayload();
	}
	
	public static CommunicationPayloadRef valueOf(String id) {
		CommunicationPayloadRef result = new CommunicationPayloadRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}