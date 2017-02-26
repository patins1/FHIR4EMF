package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AccountStatusRefElement")
public class AccountStatusRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public AccountStatus createInstance() {
		return FhirFactory.eINSTANCE.createAccountStatus();
	}
	
	public static AccountStatusRef valueOf(String id) {
		AccountStatusRef result = new AccountStatusRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}