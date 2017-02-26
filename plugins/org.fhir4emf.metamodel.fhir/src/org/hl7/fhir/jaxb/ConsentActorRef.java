package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConsentActor;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConsentActorRefElement")
public class ConsentActorRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ConsentActor createInstance() {
		return FhirFactory.eINSTANCE.createConsentActor();
	}
	
	public static ConsentActorRef valueOf(String id) {
		ConsentActorRef result = new ConsentActorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}