package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskRequester;

@XmlRootElement(name = "TaskRequesterRefElement")
public class TaskRequesterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public TaskRequester createInstance() {
		return FhirFactory.eINSTANCE.createTaskRequester();
	}
	
	public static TaskRequesterRef valueOf(String id) {
		TaskRequesterRef result = new TaskRequesterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}