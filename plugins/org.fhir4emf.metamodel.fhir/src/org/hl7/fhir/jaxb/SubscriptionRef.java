package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Subscription;

@XmlRootElement(name = "SubscriptionRefElement")
public class SubscriptionRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Subscription createInstance() {
		return FhirFactory.eINSTANCE.createSubscription();
	}
	
	public static SubscriptionRef valueOf(String id) {
		SubscriptionRef result = new SubscriptionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}