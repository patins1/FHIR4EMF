package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ConditionVerificationStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ConditionVerificationStatusRefElement")
public class ConditionVerificationStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ConditionVerificationStatus createInstance() {
		return FhirFactory.eINSTANCE.createConditionVerificationStatus();
	}
	
	public static ConditionVerificationStatusRef valueOf(String id) {
		ConditionVerificationStatusRef result = new ConditionVerificationStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}