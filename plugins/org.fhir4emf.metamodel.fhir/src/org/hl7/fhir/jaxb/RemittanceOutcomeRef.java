package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.RemittanceOutcome;

@XmlRootElement(name = "RemittanceOutcomeRefElement")
public class RemittanceOutcomeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public RemittanceOutcome createInstance() {
		return FhirFactory.eINSTANCE.createRemittanceOutcome();
	}
	
	public static RemittanceOutcomeRef valueOf(String id) {
		RemittanceOutcomeRef result = new RemittanceOutcomeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}