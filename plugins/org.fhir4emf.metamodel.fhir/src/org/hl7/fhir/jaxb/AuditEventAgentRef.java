package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventAgent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventAgentRefElement")
public class AuditEventAgentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AuditEventAgent createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventAgent();
	}
	
	public static AuditEventAgentRef valueOf(String id) {
		AuditEventAgentRef result = new AuditEventAgentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}