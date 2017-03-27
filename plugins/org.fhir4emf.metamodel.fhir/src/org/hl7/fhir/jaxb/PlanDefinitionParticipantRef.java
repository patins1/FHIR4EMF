package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionParticipant;

@XmlRootElement(name = "PlanDefinitionParticipantRefElement")
public class PlanDefinitionParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionParticipant createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionParticipant();
	}
	
	public static PlanDefinitionParticipantRef valueOf(String id) {
		PlanDefinitionParticipantRef result = new PlanDefinitionParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}