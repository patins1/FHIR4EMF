package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskStatus;

@XmlRootElement(name = "TaskStatusRefElement")
public class TaskStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TaskStatus createInstance() {
		return FhirFactory.eINSTANCE.createTaskStatus();
	}
	
	public static TaskStatusRef valueOf(String id) {
		TaskStatusRef result = new TaskStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}