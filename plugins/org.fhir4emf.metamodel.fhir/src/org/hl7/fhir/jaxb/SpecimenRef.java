package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Specimen;

@XmlRootElement(name = "SpecimenRefElement")
public class SpecimenRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Specimen createInstance() {
		return FhirFactory.eINSTANCE.createSpecimen();
	}
	
	public static SpecimenRef valueOf(String id) {
		SpecimenRef result = new SpecimenRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}