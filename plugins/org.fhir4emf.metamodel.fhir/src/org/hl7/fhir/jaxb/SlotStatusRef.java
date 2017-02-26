package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SlotStatus;

@XmlRootElement(name = "SlotStatusRefElement")
public class SlotStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public SlotStatus createInstance() {
		return FhirFactory.eINSTANCE.createSlotStatus();
	}
	
	public static SlotStatusRef valueOf(String id) {
		SlotStatusRef result = new SlotStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}