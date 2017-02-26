package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationParameterUse;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.OperationParameterUseList;
	
	
	
	

public class OperationParameterUseImplAdapter extends XmlAdapter<String, OperationParameterUse> {

	@Override
	public OperationParameterUse unmarshal(String v) throws Exception {
		OperationParameterUse result = FhirFactory.eINSTANCE.createOperationParameterUse();
		result.setValue(OperationParameterUseList.get(v));
		return result;
	}

	@Override
	public String marshal(OperationParameterUse v) throws Exception {
		return v.getValue().getLiteral();
	}

}
