package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionActionDefinition;

@XmlRootElement(name = "PlanDefinitionActionDefinitionRefElement")
public class PlanDefinitionActionDefinitionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionActionDefinition createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionActionDefinition();
	}
	
	public static PlanDefinitionActionDefinitionRef valueOf(String id) {
		PlanDefinitionActionDefinitionRef result = new PlanDefinitionActionDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}