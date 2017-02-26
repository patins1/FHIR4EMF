package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionSelectionBehaviorList;
	
	
	
	

public class ActionSelectionBehaviorImplAdapter extends XmlAdapter<String, ActionSelectionBehavior> {

	@Override
	public ActionSelectionBehavior unmarshal(String v) throws Exception {
		ActionSelectionBehavior result = FhirFactory.eINSTANCE.createActionSelectionBehavior();
		result.setValue(ActionSelectionBehaviorList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionSelectionBehavior v) throws Exception {
		return v.getValue().getLiteral();
	}

}
