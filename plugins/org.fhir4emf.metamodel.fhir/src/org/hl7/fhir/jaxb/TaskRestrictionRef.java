package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskRestriction;

@XmlRootElement(name = "TaskRestrictionRefElement")
public class TaskRestrictionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TaskRestriction createInstance() {
		return FhirFactory.eINSTANCE.createTaskRestriction();
	}
	
	public static TaskRestrictionRef valueOf(String id) {
		TaskRestrictionRef result = new TaskRestrictionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}