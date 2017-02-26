package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapModelMode;

@XmlRootElement(name = "StructureMapModelModeRefElement")
public class StructureMapModelModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapModelMode createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapModelMode();
	}
	
	public static StructureMapModelModeRef valueOf(String id) {
		StructureMapModelModeRef result = new StructureMapModelModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}