package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentActor1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentActor1RefElement")
public class ConsentActor1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentActor1 createInstance() {
		return FhirFactory.eINSTANCE.createConsentActor1();
	}
	
	public static ConsentActor1Ref valueOf(String id) {
		ConsentActor1Ref result = new ConsentActor1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}