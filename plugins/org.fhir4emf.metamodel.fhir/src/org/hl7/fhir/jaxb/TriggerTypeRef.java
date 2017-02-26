package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TriggerType;

@XmlRootElement(name = "TriggerTypeRefElement")
public class TriggerTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TriggerType createInstance() {
		return FhirFactory.eINSTANCE.createTriggerType();
	}
	
	public static TriggerTypeRef valueOf(String id) {
		TriggerTypeRef result = new TriggerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}