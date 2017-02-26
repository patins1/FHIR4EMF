package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskOutput;

@XmlRootElement(name = "TaskOutputRefElement")
public class TaskOutputRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TaskOutput createInstance() {
		return FhirFactory.eINSTANCE.createTaskOutput();
	}
	
	public static TaskOutputRef valueOf(String id) {
		TaskOutputRef result = new TaskOutputRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}