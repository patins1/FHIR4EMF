package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapSourceListMode;

@XmlRootElement(name = "StructureMapSourceListModeRefElement")
public class StructureMapSourceListModeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public StructureMapSourceListMode createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapSourceListMode();
	}
	
	public static StructureMapSourceListModeRef valueOf(String id) {
		StructureMapSourceListModeRef result = new StructureMapSourceListModeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}