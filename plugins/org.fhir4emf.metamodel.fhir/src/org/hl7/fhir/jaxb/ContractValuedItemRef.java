package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractValuedItem;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractValuedItemRefElement")
public class ContractValuedItemRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractValuedItem createInstance() {
		return FhirFactory.eINSTANCE.createContractValuedItem();
	}
	
	public static ContractValuedItemRef valueOf(String id) {
		ContractValuedItemRef result = new ContractValuedItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}