package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapStructure;

@XmlRootElement(name = "StructureMapStructureRefElement")
public class StructureMapStructureRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapStructure createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapStructure();
	}
	
	public static StructureMapStructureRef valueOf(String id) {
		StructureMapStructureRef result = new StructureMapStructureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}