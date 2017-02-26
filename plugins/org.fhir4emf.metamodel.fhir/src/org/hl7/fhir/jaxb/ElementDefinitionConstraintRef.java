package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ElementDefinitionConstraint;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ElementDefinitionConstraintRefElement")
public class ElementDefinitionConstraintRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ElementDefinitionConstraint createInstance() {
		return FhirFactory.eINSTANCE.createElementDefinitionConstraint();
	}
	
	public static ElementDefinitionConstraintRef valueOf(String id) {
		ElementDefinitionConstraintRef result = new ElementDefinitionConstraintRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}