package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TaskStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.TaskStatusList;
	
	
	
	

public class TaskStatusImplAdapter extends XmlAdapter<String, TaskStatus> {

	@Override
	public TaskStatus unmarshal(String v) throws Exception {
		TaskStatus result = FhirFactory.eINSTANCE.createTaskStatus();
		result.setValue(TaskStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(TaskStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
