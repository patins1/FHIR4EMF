package org.hl7.fhir.jaxb;

import org.hl7.fhir.AccountStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AccountStatusList;
	
	
	
	

public class AccountStatusImplAdapter extends XmlAdapter<String, AccountStatus> {

	@Override
	public AccountStatus unmarshal(String v) throws Exception {
		AccountStatus result = FhirFactory.eINSTANCE.createAccountStatus();
		result.setValue(AccountStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(AccountStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
