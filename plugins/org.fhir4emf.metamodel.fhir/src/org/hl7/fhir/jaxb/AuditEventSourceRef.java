package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventSource;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventSourceRefElement")
public class AuditEventSourceRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AuditEventSource createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventSource();
	}
	
	public static AuditEventSourceRef valueOf(String id) {
		AuditEventSourceRef result = new AuditEventSourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}