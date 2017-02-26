package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParameterDefinition;

@XmlRootElement(name = "ParameterDefinitionRefElement")
public class ParameterDefinitionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ParameterDefinition createInstance() {
		return FhirFactory.eINSTANCE.createParameterDefinition();
	}
	
	public static ParameterDefinitionRef valueOf(String id) {
		ParameterDefinitionRef result = new ParameterDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}