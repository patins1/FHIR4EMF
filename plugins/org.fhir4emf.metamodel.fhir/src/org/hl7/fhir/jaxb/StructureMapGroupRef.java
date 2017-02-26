package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapGroup;

@XmlRootElement(name = "StructureMapGroupRefElement")
public class StructureMapGroupRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapGroup createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapGroup();
	}
	
	public static StructureMapGroupRef valueOf(String id) {
		StructureMapGroupRef result = new StructureMapGroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}