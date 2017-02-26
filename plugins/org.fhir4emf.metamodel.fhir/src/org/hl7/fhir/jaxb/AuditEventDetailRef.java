package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventDetail;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventDetailRefElement")
public class AuditEventDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AuditEventDetail createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventDetail();
	}
	
	public static AuditEventDetailRef valueOf(String id) {
		AuditEventDetailRef result = new AuditEventDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}