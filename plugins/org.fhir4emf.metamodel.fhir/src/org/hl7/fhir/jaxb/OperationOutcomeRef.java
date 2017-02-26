package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationOutcome;

@XmlRootElement(name = "OperationOutcomeRefElement")
public class OperationOutcomeRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public OperationOutcome createInstance() {
		return FhirFactory.eINSTANCE.createOperationOutcome();
	}
	
	public static OperationOutcomeRef valueOf(String id) {
		OperationOutcomeRef result = new OperationOutcomeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}