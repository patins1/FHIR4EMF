package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Communication;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CommunicationRefElement")
public class CommunicationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Communication createInstance() {
		return FhirFactory.eINSTANCE.createCommunication();
	}
	
	public static CommunicationRef valueOf(String id) {
		CommunicationRef result = new CommunicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}