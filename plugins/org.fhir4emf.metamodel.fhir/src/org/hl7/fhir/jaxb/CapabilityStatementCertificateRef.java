package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.CapabilityStatementCertificate;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "CapabilityStatementCertificateRefElement")
public class CapabilityStatementCertificateRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public CapabilityStatementCertificate createInstance() {
		return FhirFactory.eINSTANCE.createCapabilityStatementCertificate();
	}
	
	public static CapabilityStatementCertificateRef valueOf(String id) {
		CapabilityStatementCertificateRef result = new CapabilityStatementCertificateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}