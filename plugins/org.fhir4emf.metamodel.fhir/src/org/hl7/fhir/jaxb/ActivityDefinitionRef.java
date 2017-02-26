package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActivityDefinition;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActivityDefinitionRefElement")
public class ActivityDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ActivityDefinition createInstance() {
		return FhirFactory.eINSTANCE.createActivityDefinition();
	}
	
	public static ActivityDefinitionRef valueOf(String id) {
		ActivityDefinitionRef result = new ActivityDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}