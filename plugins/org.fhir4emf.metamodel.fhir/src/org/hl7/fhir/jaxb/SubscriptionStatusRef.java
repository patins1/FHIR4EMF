package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubscriptionStatus;

@XmlRootElement(name = "SubscriptionStatusRefElement")
public class SubscriptionStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SubscriptionStatus createInstance() {
		return FhirFactory.eINSTANCE.createSubscriptionStatus();
	}
	
	public static SubscriptionStatusRef valueOf(String id) {
		SubscriptionStatusRef result = new SubscriptionStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}