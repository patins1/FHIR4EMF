package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionPrecheckBehaviorList;
	
	
	
	

public class ActionPrecheckBehaviorImplAdapter extends XmlAdapter<String, ActionPrecheckBehavior> {

	@Override
	public ActionPrecheckBehavior unmarshal(String v) throws Exception {
		ActionPrecheckBehavior result = FhirFactory.eINSTANCE.createActionPrecheckBehavior();
		result.setValue(ActionPrecheckBehaviorList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionPrecheckBehavior v) throws Exception {
		return v.getValue().getLiteral();
	}

}
