package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationOutcomeIssue;

@XmlRootElement(name = "OperationOutcomeIssueRefElement")
public class OperationOutcomeIssueRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public OperationOutcomeIssue createInstance() {
		return FhirFactory.eINSTANCE.createOperationOutcomeIssue();
	}
	
	public static OperationOutcomeIssueRef valueOf(String id) {
		OperationOutcomeIssueRef result = new OperationOutcomeIssueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}