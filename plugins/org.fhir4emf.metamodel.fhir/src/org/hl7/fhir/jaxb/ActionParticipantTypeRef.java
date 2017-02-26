package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionParticipantTypeRefElement")
public class ActionParticipantTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionParticipantType createInstance() {
		return FhirFactory.eINSTANCE.createActionParticipantType();
	}
	
	public static ActionParticipantTypeRef valueOf(String id) {
		ActionParticipantTypeRef result = new ActionParticipantTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}