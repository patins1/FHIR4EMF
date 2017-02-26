package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionConditionKind;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionConditionKindList;
	
	
	
	

public class ActionConditionKindImplAdapter extends XmlAdapter<String, ActionConditionKind> {

	@Override
	public ActionConditionKind unmarshal(String v) throws Exception {
		ActionConditionKind result = FhirFactory.eINSTANCE.createActionConditionKind();
		result.setValue(ActionConditionKindList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionConditionKind v) throws Exception {
		return v.getValue().getLiteral();
	}

}
