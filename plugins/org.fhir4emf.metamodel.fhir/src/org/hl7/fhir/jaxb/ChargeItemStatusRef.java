package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ChargeItemStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ChargeItemStatusRefElement")
public class ChargeItemStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ChargeItemStatus createInstance() {
		return FhirFactory.eINSTANCE.createChargeItemStatus();
	}
	
	public static ChargeItemStatusRef valueOf(String id) {
		ChargeItemStatusRef result = new ChargeItemStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}