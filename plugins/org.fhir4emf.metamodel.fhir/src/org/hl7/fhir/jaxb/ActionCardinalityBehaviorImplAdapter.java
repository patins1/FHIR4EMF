package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionCardinalityBehavior;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionCardinalityBehaviorList;
	
	
	
	

public class ActionCardinalityBehaviorImplAdapter extends XmlAdapter<String, ActionCardinalityBehavior> {

	@Override
	public ActionCardinalityBehavior unmarshal(String v) throws Exception {
		ActionCardinalityBehavior result = FhirFactory.eINSTANCE.createActionCardinalityBehavior();
		result.setValue(ActionCardinalityBehaviorList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionCardinalityBehavior v) throws Exception {
		return v.getValue().getLiteral();
	}

}
