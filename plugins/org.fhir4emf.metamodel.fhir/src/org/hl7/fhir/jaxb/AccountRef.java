package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Account;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AccountRefElement")
public class AccountRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Account createInstance() {
		return FhirFactory.eINSTANCE.createAccount();
	}
	
	public static AccountRef valueOf(String id) {
		AccountRef result = new AccountRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}