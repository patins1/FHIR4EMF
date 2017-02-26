package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationDefinitionParameter;

@XmlRootElement(name = "OperationDefinitionParameterRefElement")
public class OperationDefinitionParameterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public OperationDefinitionParameter createInstance() {
		return FhirFactory.eINSTANCE.createOperationDefinitionParameter();
	}
	
	public static OperationDefinitionParameterRef valueOf(String id) {
		OperationDefinitionParameterRef result = new OperationDefinitionParameterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}