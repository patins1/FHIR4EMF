package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ChargeItemParticipant;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ChargeItemParticipantRefElement")
public class ChargeItemParticipantRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ChargeItemParticipant createInstance() {
		return FhirFactory.eINSTANCE.createChargeItemParticipant();
	}
	
	public static ChargeItemParticipantRef valueOf(String id) {
		ChargeItemParticipantRef result = new ChargeItemParticipantRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}