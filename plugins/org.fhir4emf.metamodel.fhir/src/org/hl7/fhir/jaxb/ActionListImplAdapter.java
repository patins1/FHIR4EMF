package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionList;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionListList;
	
	
	
	

public class ActionListImplAdapter extends XmlAdapter<String, ActionList> {

	@Override
	public ActionList unmarshal(String v) throws Exception {
		ActionList result = FhirFactory.eINSTANCE.createActionList();
		result.setValue(ActionListList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionList v) throws Exception {
		return v.getValue().getLiteral();
	}

}
