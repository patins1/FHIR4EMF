package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Quantity;

@XmlRootElement(name = "QuantityRefElement")
public class QuantityRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public Quantity createInstance() {
		return FhirFactory.eINSTANCE.createQuantity();
	}
	
	public static QuantityRef valueOf(String id) {
		QuantityRef result = new QuantityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}