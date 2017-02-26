package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.Contract;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractRefElement")
public class ContractRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Contract createInstance() {
		return FhirFactory.eINSTANCE.createContract();
	}
	
	public static ContractRef valueOf(String id) {
		ContractRef result = new ContractRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}