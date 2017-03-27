package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActivityDefinitionParticipant;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActivityDefinitionParticipantRefElement")
public class ActivityDefinitionParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ActivityDefinitionParticipant createInstance() {
		return FhirFactory.eINSTANCE.createActivityDefinitionParticipant();
	}
	
	public static ActivityDefinitionParticipantRef valueOf(String id) {
		ActivityDefinitionParticipantRef result = new ActivityDefinitionParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}