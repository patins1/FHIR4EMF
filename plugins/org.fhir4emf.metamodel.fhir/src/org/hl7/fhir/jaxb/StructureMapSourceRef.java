package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapSource;

@XmlRootElement(name = "StructureMapSourceRefElement")
public class StructureMapSourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapSource createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapSource();
	}
	
	public static StructureMapSourceRef valueOf(String id) {
		StructureMapSourceRef result = new StructureMapSourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}