package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SpecimenContainer;

@XmlRootElement(name = "SpecimenContainerRefElement")
public class SpecimenContainerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SpecimenContainer createInstance() {
		return FhirFactory.eINSTANCE.createSpecimenContainer();
	}
	
	public static SpecimenContainerRef valueOf(String id) {
		SpecimenContainerRef result = new SpecimenContainerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}