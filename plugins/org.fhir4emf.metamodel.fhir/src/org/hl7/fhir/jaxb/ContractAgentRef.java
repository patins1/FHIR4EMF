package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ContractAgent;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ContractAgentRefElement")
public class ContractAgentRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public ContractAgent createInstance() {
		return FhirFactory.eINSTANCE.createContractAgent();
	}
	
	public static ContractAgentRef valueOf(String id) {
		ContractAgentRef result = new ContractAgentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}