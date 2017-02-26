package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinition;

@XmlRootElement(name = "StructureDefinitionRefElement")
public class StructureDefinitionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public StructureDefinition createInstance() {
		return FhirFactory.eINSTANCE.createStructureDefinition();
	}
	
	public static StructureDefinitionRef valueOf(String id) {
		StructureDefinitionRef result = new StructureDefinitionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}