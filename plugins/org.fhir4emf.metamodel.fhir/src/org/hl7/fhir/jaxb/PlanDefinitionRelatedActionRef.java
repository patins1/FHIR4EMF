package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionRelatedAction;

@XmlRootElement(name = "PlanDefinitionRelatedActionRefElement")
public class PlanDefinitionRelatedActionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionRelatedAction createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionRelatedAction();
	}
	
	public static PlanDefinitionRelatedActionRef valueOf(String id) {
		PlanDefinitionRelatedActionRef result = new PlanDefinitionRelatedActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}