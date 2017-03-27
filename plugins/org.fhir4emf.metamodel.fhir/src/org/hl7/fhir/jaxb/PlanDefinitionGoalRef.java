package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionGoal;

@XmlRootElement(name = "PlanDefinitionGoalRefElement")
public class PlanDefinitionGoalRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionGoal createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionGoal();
	}
	
	public static PlanDefinitionGoalRef valueOf(String id) {
		PlanDefinitionGoalRef result = new PlanDefinitionGoalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}