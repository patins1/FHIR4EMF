package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PaymentNotice;

@XmlRootElement(name = "PaymentNoticeRefElement")
public class PaymentNoticeRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public PaymentNotice createInstance() {
		return FhirFactory.eINSTANCE.createPaymentNotice();
	}
	
	public static PaymentNoticeRef valueOf(String id) {
		PaymentNoticeRef result = new PaymentNoticeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}