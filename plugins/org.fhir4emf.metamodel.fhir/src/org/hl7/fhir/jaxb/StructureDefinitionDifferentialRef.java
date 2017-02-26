package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinitionDifferential;

@XmlRootElement(name = "StructureDefinitionDifferentialRefElement")
public class StructureDefinitionDifferentialRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureDefinitionDifferential createInstance() {
		return FhirFactory.eINSTANCE.createStructureDefinitionDifferential();
	}
	
	public static StructureDefinitionDifferentialRef valueOf(String id) {
		StructureDefinitionDifferentialRef result = new StructureDefinitionDifferentialRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}