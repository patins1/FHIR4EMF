package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventRefElement")
public class AuditEventRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public AuditEvent createInstance() {
		return FhirFactory.eINSTANCE.createAuditEvent();
	}
	
	public static AuditEventRef valueOf(String id) {
		AuditEventRef result = new AuditEventRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}