package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyDeliverySuppliedItem;

@XmlRootElement(name = "SupplyDeliverySuppliedItemRefElement")
public class SupplyDeliverySuppliedItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SupplyDeliverySuppliedItem createInstance() {
		return FhirFactory.eINSTANCE.createSupplyDeliverySuppliedItem();
	}
	
	public static SupplyDeliverySuppliedItemRef valueOf(String id) {
		SupplyDeliverySuppliedItemRef result = new SupplyDeliverySuppliedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}