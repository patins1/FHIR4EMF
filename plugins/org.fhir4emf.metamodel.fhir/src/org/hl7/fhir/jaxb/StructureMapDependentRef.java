package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureMapDependent;

@XmlRootElement(name = "StructureMapDependentRefElement")
public class StructureMapDependentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureMapDependent createInstance() {
		return FhirFactory.eINSTANCE.createStructureMapDependent();
	}
	
	public static StructureMapDependentRef valueOf(String id) {
		StructureMapDependentRef result = new StructureMapDependentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}