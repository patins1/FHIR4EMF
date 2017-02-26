package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GoalStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GoalStatusList;
	
	
	
	

public class GoalStatusImplAdapter extends XmlAdapter<String, GoalStatus> {

	@Override
	public GoalStatus unmarshal(String v) throws Exception {
		GoalStatus result = FhirFactory.eINSTANCE.createGoalStatus();
		result.setValue(GoalStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(GoalStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
