package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractTerm;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractTermRefElement")
public class ContractTermRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractTerm createInstance() {
		return FhirFactory.eINSTANCE.createContractTerm();
	}
	
	public static ContractTermRef valueOf(String id) {
		ContractTermRef result = new ContractTermRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}