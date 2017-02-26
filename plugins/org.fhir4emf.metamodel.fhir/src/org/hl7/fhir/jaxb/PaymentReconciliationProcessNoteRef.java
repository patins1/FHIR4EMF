package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.PaymentReconciliationProcessNote;

@XmlRootElement(name = "PaymentReconciliationProcessNoteRefElement")
public class PaymentReconciliationProcessNoteRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public PaymentReconciliationProcessNote createInstance() {
		return FhirFactory.eINSTANCE.createPaymentReconciliationProcessNote();
	}
	
	public static PaymentReconciliationProcessNoteRef valueOf(String id) {
		PaymentReconciliationProcessNoteRef result = new PaymentReconciliationProcessNoteRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}