package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GoalStatus;

@XmlRootElement(name = "GoalStatusRefElement")
public class GoalStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GoalStatus createInstance() {
		return FhirFactory.eINSTANCE.createGoalStatus();
	}
	
	public static GoalStatusRef valueOf(String id) {
		GoalStatusRef result = new GoalStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}