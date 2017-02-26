package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActivityDefinitionDynamicValue;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActivityDefinitionDynamicValueRefElement")
public class ActivityDefinitionDynamicValueRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ActivityDefinitionDynamicValue createInstance() {
		return FhirFactory.eINSTANCE.createActivityDefinitionDynamicValue();
	}
	
	public static ActivityDefinitionDynamicValueRef valueOf(String id) {
		ActivityDefinitionDynamicValueRef result = new ActivityDefinitionDynamicValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}