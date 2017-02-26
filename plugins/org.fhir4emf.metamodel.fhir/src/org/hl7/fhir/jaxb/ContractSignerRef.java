package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractSigner;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractSignerRefElement")
public class ContractSignerRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractSigner createInstance() {
		return FhirFactory.eINSTANCE.createContractSigner();
	}
	
	public static ContractSignerRef valueOf(String id) {
		ContractSignerRef result = new ContractSignerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}