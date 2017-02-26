package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventEntity;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventEntityRefElement")
public class AuditEventEntityRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AuditEventEntity createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventEntity();
	}
	
	public static AuditEventEntityRef valueOf(String id) {
		AuditEventEntityRef result = new AuditEventEntityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}