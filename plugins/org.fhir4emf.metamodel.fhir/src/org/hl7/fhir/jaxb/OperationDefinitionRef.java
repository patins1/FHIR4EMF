package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationDefinition;

@XmlRootElement(name = "OperationDefinitionRefElement")
public class OperationDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public OperationDefinition createInstance() {
		return FhirFactory.eINSTANCE.createOperationDefinition();
	}
	
	public static OperationDefinitionRef valueOf(String id) {
		OperationDefinitionRef result = new OperationDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}