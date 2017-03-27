package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionAction;

@XmlRootElement(name = "PlanDefinitionActionRefElement")
public class PlanDefinitionActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionAction createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionAction();
	}
	
	public static PlanDefinitionActionRef valueOf(String id) {
		PlanDefinitionActionRef result = new PlanDefinitionActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}