package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractResourceStatusCodes;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractResourceStatusCodesRefElement")
public class ContractResourceStatusCodesRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ContractResourceStatusCodes createInstance() {
		return FhirFactory.eINSTANCE.createContractResourceStatusCodes();
	}
	
	public static ContractResourceStatusCodesRef valueOf(String id) {
		ContractResourceStatusCodesRef result = new ContractResourceStatusCodesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}