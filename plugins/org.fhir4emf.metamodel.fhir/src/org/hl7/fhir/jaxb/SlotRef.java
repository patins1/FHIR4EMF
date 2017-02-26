package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Slot;

@XmlRootElement(name = "SlotRefElement")
public class SlotRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Slot createInstance() {
		return FhirFactory.eINSTANCE.createSlot();
	}
	
	public static SlotRef valueOf(String id) {
		SlotRef result = new SlotRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}