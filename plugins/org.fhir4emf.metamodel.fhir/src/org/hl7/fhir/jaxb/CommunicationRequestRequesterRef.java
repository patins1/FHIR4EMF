package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CommunicationRequestRequester;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CommunicationRequestRequesterRefElement")
public class CommunicationRequestRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CommunicationRequestRequester createInstance() {
		return FhirFactory.eINSTANCE.createCommunicationRequestRequester();
	}
	
	public static CommunicationRequestRequesterRef valueOf(String id) {
		CommunicationRequestRequesterRef result = new CommunicationRequestRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}