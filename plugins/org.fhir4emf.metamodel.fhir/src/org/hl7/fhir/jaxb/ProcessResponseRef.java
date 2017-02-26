package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcessResponse;

@XmlRootElement(name = "ProcessResponseRefElement")
public class ProcessResponseRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ProcessResponse createInstance() {
		return FhirFactory.eINSTANCE.createProcessResponse();
	}
	
	public static ProcessResponseRef valueOf(String id) {
		ProcessResponseRef result = new ProcessResponseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}