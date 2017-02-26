package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskInput;

@XmlRootElement(name = "TaskInputRefElement")
public class TaskInputRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TaskInput createInstance() {
		return FhirFactory.eINSTANCE.createTaskInput();
	}
	
	public static TaskInputRef valueOf(String id) {
		TaskInputRef result = new TaskInputRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}