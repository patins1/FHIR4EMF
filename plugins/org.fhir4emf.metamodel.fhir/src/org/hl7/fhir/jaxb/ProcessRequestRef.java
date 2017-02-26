package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcessRequest;

@XmlRootElement(name = "ProcessRequestRefElement")
public class ProcessRequestRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ProcessRequest createInstance() {
		return FhirFactory.eINSTANCE.createProcessRequest();
	}
	
	public static ProcessRequestRef valueOf(String id) {
		ProcessRequestRef result = new ProcessRequestRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}