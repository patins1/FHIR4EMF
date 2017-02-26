package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AuditEventAction;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AuditEventActionRefElement")
public class AuditEventActionRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AuditEventAction createInstance() {
		return FhirFactory.eINSTANCE.createAuditEventAction();
	}
	
	public static AuditEventActionRef valueOf(String id) {
		AuditEventActionRef result = new AuditEventActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}