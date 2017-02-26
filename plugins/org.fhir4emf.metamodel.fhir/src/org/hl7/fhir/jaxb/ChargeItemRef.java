package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ChargeItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ChargeItemRefElement")
public class ChargeItemRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public ChargeItem createInstance() {
		return FhirFactory.eINSTANCE.createChargeItem();
	}
	
	public static ChargeItemRef valueOf(String id) {
		ChargeItemRef result = new ChargeItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}