package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Task;

@XmlRootElement(name = "TaskRefElement")
public class TaskRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Task createInstance() {
		return FhirFactory.eINSTANCE.createTask();
	}
	
	public static TaskRef valueOf(String id) {
		TaskRef result = new TaskRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}