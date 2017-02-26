package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventNetwork;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventNetworkRefElement")
public class AuditEventNetworkRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AuditEventNetwork createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventNetwork();
	}
	
	public static AuditEventNetworkRef valueOf(String id) {
		AuditEventNetworkRef result = new AuditEventNetworkRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}