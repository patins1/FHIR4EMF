package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationDefinitionOverload;

@XmlRootElement(name = "OperationDefinitionOverloadRefElement")
public class OperationDefinitionOverloadRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public OperationDefinitionOverload createInstance() {
		return FhirFactory.eINSTANCE.createOperationDefinitionOverload();
	}
	
	public static OperationDefinitionOverloadRef valueOf(String id) {
		OperationDefinitionOverloadRef result = new OperationDefinitionOverloadRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}