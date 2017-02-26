package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapTargetListMode;

@XmlRootElement(name = "StructureMapTargetListModeRefElement")
public class StructureMapTargetListModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapTargetListMode createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapTargetListMode();
	}
	
	public static StructureMapTargetListModeRef valueOf(String id) {
		StructureMapTargetListModeRef result = new StructureMapTargetListModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}