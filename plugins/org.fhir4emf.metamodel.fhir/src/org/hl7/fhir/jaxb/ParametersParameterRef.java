package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ParametersParameter;

@XmlRootElement(name = "ParametersParameterRefElement")
public class ParametersParameterRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ParametersParameter createInstance() {
		return FhirFactory.eINSTANCE.createParametersParameter();
	}
	
	public static ParametersParameterRef valueOf(String id) {
		ParametersParameterRef result = new ParametersParameterRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}