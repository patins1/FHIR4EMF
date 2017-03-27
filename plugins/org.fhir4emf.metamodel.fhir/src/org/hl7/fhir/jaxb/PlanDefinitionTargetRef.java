package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionTarget;

@XmlRootElement(name = "PlanDefinitionTargetRefElement")
public class PlanDefinitionTargetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionTarget createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionTarget();
	}
	
	public static PlanDefinitionTargetRef valueOf(String id) {
		PlanDefinitionTargetRef result = new PlanDefinitionTargetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}