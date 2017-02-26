package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PaymentReconciliationDetail;

@XmlRootElement(name = "PaymentReconciliationDetailRefElement")
public class PaymentReconciliationDetailRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PaymentReconciliationDetail createInstance() {
		return FhirFactory.eINSTANCE.createPaymentReconciliationDetail();
	}
	
	public static PaymentReconciliationDetailRef valueOf(String id) {
		PaymentReconciliationDetailRef result = new PaymentReconciliationDetailRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}