package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyDelivery;

@XmlRootElement(name = "SupplyDeliveryRefElement")
public class SupplyDeliveryRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public SupplyDelivery createInstance() {
		return FhirFactory.eINSTANCE.createSupplyDelivery();
	}
	
	public static SupplyDeliveryRef valueOf(String id) {
		SupplyDeliveryRef result = new SupplyDeliveryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}