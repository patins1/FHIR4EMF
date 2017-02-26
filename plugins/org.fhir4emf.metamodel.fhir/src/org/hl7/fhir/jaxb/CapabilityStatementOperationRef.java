package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementOperation;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementOperationRefElement")
public class CapabilityStatementOperationRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementOperation createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementOperation();
	}
	
	public static CapabilityStatementOperationRef valueOf(String id) {
		CapabilityStatementOperationRef result = new CapabilityStatementOperationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}