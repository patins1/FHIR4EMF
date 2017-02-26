package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActivityDefinitionCategory;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActivityDefinitionCategoryList;
	
	
	
	

public class ActivityDefinitionCategoryImplAdapter extends XmlAdapter<String, ActivityDefinitionCategory> {

	@Override
	public ActivityDefinitionCategory unmarshal(String v) throws Exception {
		ActivityDefinitionCategory result = FhirFactory.eINSTANCE.createActivityDefinitionCategory();
		result.setValue(ActivityDefinitionCategoryList.get(v));
		return result;
	}

	@Override
	public String marshal(ActivityDefinitionCategory v) throws Exception {
		return v.getValue().getLiteral();
	}

}
