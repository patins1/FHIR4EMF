package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapInputMode;

@XmlRootElement(name = "StructureMapInputModeRefElement")
public class StructureMapInputModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapInputMode createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapInputMode();
	}
	
	public static StructureMapInputModeRef valueOf(String id) {
		StructureMapInputModeRef result = new StructureMapInputModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}