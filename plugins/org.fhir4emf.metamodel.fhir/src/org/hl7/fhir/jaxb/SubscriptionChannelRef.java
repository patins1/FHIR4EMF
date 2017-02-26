package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SubscriptionChannel;

@XmlRootElement(name = "SubscriptionChannelRefElement")
public class SubscriptionChannelRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SubscriptionChannel createInstance() {
		return FhirFactory.eINSTANCE.createSubscriptionChannel();
	}
	
	public static SubscriptionChannelRef valueOf(String id) {
		SubscriptionChannelRef result = new SubscriptionChannelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}