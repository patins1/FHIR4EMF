package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationDefinitionBinding;

@XmlRootElement(name = "OperationDefinitionBindingRefElement")
public class OperationDefinitionBindingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public OperationDefinitionBinding createInstance() {
		return FhirFactory.eINSTANCE.createOperationDefinitionBinding();
	}
	
	public static OperationDefinitionBindingRef valueOf(String id) {
		OperationDefinitionBindingRef result = new OperationDefinitionBindingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}