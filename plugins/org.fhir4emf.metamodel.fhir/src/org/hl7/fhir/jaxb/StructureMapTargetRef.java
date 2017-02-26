package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapTarget;

@XmlRootElement(name = "StructureMapTargetRefElement")
public class StructureMapTargetRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapTarget createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapTarget();
	}
	
	public static StructureMapTargetRef valueOf(String id) {
		StructureMapTargetRef result = new StructureMapTargetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}