package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionGroupingBehavior;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionGroupingBehaviorList;
	
	
	
	

public class ActionGroupingBehaviorImplAdapter extends XmlAdapter<String, ActionGroupingBehavior> {

	@Override
	public ActionGroupingBehavior unmarshal(String v) throws Exception {
		ActionGroupingBehavior result = FhirFactory.eINSTANCE.createActionGroupingBehavior();
		result.setValue(ActionGroupingBehaviorList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionGroupingBehavior v) throws Exception {
		return v.getValue().getLiteral();
	}

}
