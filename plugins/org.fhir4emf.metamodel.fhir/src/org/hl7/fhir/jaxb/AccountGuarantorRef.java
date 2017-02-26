package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AccountGuarantor;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AccountGuarantorRefElement")
public class AccountGuarantorRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AccountGuarantor createInstance() {
		return FhirFactory.eINSTANCE.createAccountGuarantor();
	}
	
	public static AccountGuarantorRef valueOf(String id) {
		AccountGuarantorRef result = new AccountGuarantorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}