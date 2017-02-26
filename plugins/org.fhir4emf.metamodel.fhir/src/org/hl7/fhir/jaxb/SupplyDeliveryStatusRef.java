package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyDeliveryStatus;

@XmlRootElement(name = "SupplyDeliveryStatusRefElement")
public class SupplyDeliveryStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SupplyDeliveryStatus createInstance() {
		return FhirFactory.eINSTANCE.createSupplyDeliveryStatus();
	}
	
	public static SupplyDeliveryStatusRef valueOf(String id) {
		SupplyDeliveryStatusRef result = new SupplyDeliveryStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}