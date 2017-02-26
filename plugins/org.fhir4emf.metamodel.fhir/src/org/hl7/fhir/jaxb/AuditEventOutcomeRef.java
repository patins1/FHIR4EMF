package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventOutcome;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventOutcomeRefElement")
public class AuditEventOutcomeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AuditEventOutcome createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventOutcome();
	}
	
	public static AuditEventOutcomeRef valueOf(String id) {
		AuditEventOutcomeRef result = new AuditEventOutcomeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}