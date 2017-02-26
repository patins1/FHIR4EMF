package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionCondition;

@XmlRootElement(name = "PlanDefinitionConditionRefElement")
public class PlanDefinitionConditionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionCondition createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionCondition();
	}
	
	public static PlanDefinitionConditionRef valueOf(String id) {
		PlanDefinitionConditionRef result = new PlanDefinitionConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}