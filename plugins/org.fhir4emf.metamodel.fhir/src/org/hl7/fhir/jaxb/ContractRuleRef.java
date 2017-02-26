package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractRule;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractRuleRefElement")
public class ContractRuleRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractRule createInstance() {
		return FhirFactory.eINSTANCE.createContractRule();
	}
	
	public static ContractRuleRef valueOf(String id) {
		ContractRuleRef result = new ContractRuleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}