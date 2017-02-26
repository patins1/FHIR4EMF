package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinition;

@XmlRootElement(name = "PlanDefinitionRefElement")
public class PlanDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public PlanDefinition createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinition();
	}
	
	public static PlanDefinitionRef valueOf(String id) {
		PlanDefinitionRef result = new PlanDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}