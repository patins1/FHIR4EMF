package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PractitionerRole1;

@XmlRootElement(name = "PractitionerRole1RefElement")
public class PractitionerRole1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PractitionerRole1 createInstance() {
		return FhirFactory.eINSTANCE.createPractitionerRole1();
	}
	
	public static PractitionerRole1Ref valueOf(String id) {
		PractitionerRole1Ref result = new PractitionerRole1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}