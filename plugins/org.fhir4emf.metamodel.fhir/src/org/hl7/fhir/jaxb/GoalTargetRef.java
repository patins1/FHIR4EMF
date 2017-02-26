package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GoalTarget;

@XmlRootElement(name = "GoalTargetRefElement")
public class GoalTargetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GoalTarget createInstance() {
		return FhirFactory.eINSTANCE.createGoalTarget();
	}
	
	public static GoalTargetRef valueOf(String id) {
		GoalTargetRef result = new GoalTargetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}