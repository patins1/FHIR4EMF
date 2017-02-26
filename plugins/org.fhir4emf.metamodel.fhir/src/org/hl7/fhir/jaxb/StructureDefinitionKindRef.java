package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinitionKind;

@XmlRootElement(name = "StructureDefinitionKindRefElement")
public class StructureDefinitionKindRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureDefinitionKind createInstance() {
		return FhirFactory.eINSTANCE.createStructureDefinitionKind();
	}
	
	public static StructureDefinitionKindRef valueOf(String id) {
		StructureDefinitionKindRef result = new StructureDefinitionKindRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}