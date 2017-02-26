package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Goal;

@XmlRootElement(name = "GoalRefElement")
public class GoalRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Goal createInstance() {
		return FhirFactory.eINSTANCE.createGoal();
	}
	
	public static GoalRef valueOf(String id) {
		GoalRef result = new GoalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}