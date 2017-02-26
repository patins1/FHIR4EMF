package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractValuedItem1;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractValuedItem1RefElement")
public class ContractValuedItem1Ref extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractValuedItem1 createInstance() {
		return FhirFactory.eINSTANCE.createContractValuedItem1();
	}
	
	public static ContractValuedItem1Ref valueOf(String id) {
		ContractValuedItem1Ref result = new ContractValuedItem1Ref();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}