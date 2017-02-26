package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapGroupTypeMode;

@XmlRootElement(name = "StructureMapGroupTypeModeRefElement")
public class StructureMapGroupTypeModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapGroupTypeMode createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapGroupTypeMode();
	}
	
	public static StructureMapGroupTypeModeRef valueOf(String id) {
		StructureMapGroupTypeModeRef result = new StructureMapGroupTypeModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}