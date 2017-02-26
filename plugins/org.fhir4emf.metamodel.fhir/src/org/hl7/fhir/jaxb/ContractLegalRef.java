package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractLegal;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractLegalRefElement")
public class ContractLegalRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractLegal createInstance() {
		return FhirFactory.eINSTANCE.createContractLegal();
	}
	
	public static ContractLegalRef valueOf(String id) {
		ContractLegalRef result = new ContractLegalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}