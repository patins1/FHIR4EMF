package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SupplyRequestOrderedItem;

@XmlRootElement(name = "SupplyRequestOrderedItemRefElement")
public class SupplyRequestOrderedItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public SupplyRequestOrderedItem createInstance() {
		return FhirFactory.eINSTANCE.createSupplyRequestOrderedItem();
	}
	
	public static SupplyRequestOrderedItemRef valueOf(String id) {
		SupplyRequestOrderedItemRef result = new SupplyRequestOrderedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}