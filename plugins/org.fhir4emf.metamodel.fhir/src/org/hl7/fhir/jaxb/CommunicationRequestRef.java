package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CommunicationRequestRefElement")
public class CommunicationRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public CommunicationRequest createInstance() {
		return FhirFactory.eINSTANCE.createCommunicationRequest();
	}
	
	public static CommunicationRequestRef valueOf(String id) {
		CommunicationRequestRef result = new CommunicationRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}