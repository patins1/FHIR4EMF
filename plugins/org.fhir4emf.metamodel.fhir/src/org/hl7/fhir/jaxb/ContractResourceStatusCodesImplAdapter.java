package org.hl7.fhir.jaxb;

import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ContractResourceStatusCodesList;
	
	
	
	

public class ContractResourceStatusCodesImplAdapter extends XmlAdapter<String, ContractResourceStatusCodes> {

	@Override
	public ContractResourceStatusCodes unmarshal(String v) throws Exception {
		ContractResourceStatusCodes result = FhirFactory.eINSTANCE.createContractResourceStatusCodes();
		result.setValue(ContractResourceStatusCodesList.get(v));
		return result;
	}

	@Override
	public String marshal(ContractResourceStatusCodes v) throws Exception {
		return v.getValue().getLiteral();
	}

}
