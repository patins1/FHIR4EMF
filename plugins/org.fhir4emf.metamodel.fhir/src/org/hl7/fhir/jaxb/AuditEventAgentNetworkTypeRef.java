package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventAgentNetworkType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventAgentNetworkTypeRefElement")
public class AuditEventAgentNetworkTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AuditEventAgentNetworkType createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventAgentNetworkType();
	}
	
	public static AuditEventAgentNetworkTypeRef valueOf(String id) {
		AuditEventAgentNetworkTypeRef result = new AuditEventAgentNetworkTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}