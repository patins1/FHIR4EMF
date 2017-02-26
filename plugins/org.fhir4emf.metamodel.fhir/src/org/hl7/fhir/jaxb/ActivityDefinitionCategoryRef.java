package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActivityDefinitionCategoryRefElement")
public class ActivityDefinitionCategoryRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActivityDefinitionCategory createInstance() {
		return FhirFactory.eINSTANCE.createActivityDefinitionCategory();
	}
	
	public static ActivityDefinitionCategoryRef valueOf(String id) {
		ActivityDefinitionCategoryRef result = new ActivityDefinitionCategoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}