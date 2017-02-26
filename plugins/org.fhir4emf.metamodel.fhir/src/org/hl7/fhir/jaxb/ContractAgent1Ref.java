package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractAgent1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractAgent1RefElement")
public class ContractAgent1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractAgent1 createInstance() {
		return FhirFactory.eINSTANCE.createContractAgent1();
	}
	
	public static ContractAgent1Ref valueOf(String id) {
		ContractAgent1Ref result = new ContractAgent1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}