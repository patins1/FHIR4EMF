package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractFriendly;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractFriendlyRefElement")
public class ContractFriendlyRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractFriendly createInstance() {
		return FhirFactory.eINSTANCE.createContractFriendly();
	}
	
	public static ContractFriendlyRef valueOf(String id) {
		ContractFriendlyRef result = new ContractFriendlyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}