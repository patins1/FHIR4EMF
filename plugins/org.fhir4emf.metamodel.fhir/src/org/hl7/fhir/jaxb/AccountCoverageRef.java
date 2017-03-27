package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.AccountCoverage;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "AccountCoverageRefElement")
public class AccountCoverageRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public AccountCoverage createInstance() {
		return FhirFactory.eINSTANCE.createAccountCoverage();
	}
	
	public static AccountCoverageRef valueOf(String id) {
		AccountCoverageRef result = new AccountCoverageRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}