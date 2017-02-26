package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PlanDefinitionDynamicValue;

@XmlRootElement(name = "PlanDefinitionDynamicValueRefElement")
public class PlanDefinitionDynamicValueRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PlanDefinitionDynamicValue createInstance() {
		return FhirFactory.eINSTANCE.createPlanDefinitionDynamicValue();
	}
	
	public static PlanDefinitionDynamicValueRef valueOf(String id) {
		PlanDefinitionDynamicValueRef result = new PlanDefinitionDynamicValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}