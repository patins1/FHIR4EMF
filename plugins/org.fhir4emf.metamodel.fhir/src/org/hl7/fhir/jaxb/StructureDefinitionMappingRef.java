package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinitionMapping;

@XmlRootElement(name = "StructureDefinitionMappingRefElement")
public class StructureDefinitionMappingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureDefinitionMapping createInstance() {
		return FhirFactory.eINSTANCE.createStructureDefinitionMapping();
	}
	
	public static StructureDefinitionMappingRef valueOf(String id) {
		StructureDefinitionMappingRef result = new StructureDefinitionMappingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}