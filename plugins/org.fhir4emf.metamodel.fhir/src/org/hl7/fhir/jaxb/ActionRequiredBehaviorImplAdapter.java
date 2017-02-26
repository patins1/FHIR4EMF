package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionRequiredBehaviorList;
	
	
	
	

public class ActionRequiredBehaviorImplAdapter extends XmlAdapter<String, ActionRequiredBehavior> {

	@Override
	public ActionRequiredBehavior unmarshal(String v) throws Exception {
		ActionRequiredBehavior result = FhirFactory.eINSTANCE.createActionRequiredBehavior();
		result.setValue(ActionRequiredBehaviorList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionRequiredBehavior v) throws Exception {
		return v.getValue().getLiteral();
	}

}
