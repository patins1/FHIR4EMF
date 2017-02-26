package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SpecimenCollection;

@XmlRootElement(name = "SpecimenCollectionRefElement")
public class SpecimenCollectionRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SpecimenCollection createInstance() {
		return FhirFactory.eINSTANCE.createSpecimenCollection();
	}
	
	public static SpecimenCollectionRef valueOf(String id) {
		SpecimenCollectionRef result = new SpecimenCollectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}