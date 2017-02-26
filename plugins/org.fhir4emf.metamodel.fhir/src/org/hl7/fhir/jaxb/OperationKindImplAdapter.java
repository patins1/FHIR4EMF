package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.OperationKind;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.OperationKindList;
	
	
	
	

public class OperationKindImplAdapter extends XmlAdapter<String, OperationKind> {

	@Override
	public OperationKind unmarshal(String v) throws Exception {
		OperationKind result = FhirFactory.eINSTANCE.createOperationKind();
		result.setValue(OperationKindList.get(v));
		return result;
	}

	@Override
	public String marshal(OperationKind v) throws Exception {
		return v.getValue().getLiteral();
	}

}
