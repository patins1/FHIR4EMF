package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PaymentReconciliation;

@XmlRootElement(name = "PaymentReconciliationRefElement")
public class PaymentReconciliationRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public PaymentReconciliation createInstance() {
		return FhirFactory.eINSTANCE.createPaymentReconciliation();
	}
	
	public static PaymentReconciliationRef valueOf(String id) {
		PaymentReconciliationRef result = new PaymentReconciliationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}