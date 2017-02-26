package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SpecimenProcessing;

@XmlRootElement(name = "SpecimenProcessingRefElement")
public class SpecimenProcessingRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SpecimenProcessing createInstance() {
		return FhirFactory.eINSTANCE.createSpecimenProcessing();
	}
	
	public static SpecimenProcessingRef valueOf(String id) {
		SpecimenProcessingRef result = new SpecimenProcessingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}