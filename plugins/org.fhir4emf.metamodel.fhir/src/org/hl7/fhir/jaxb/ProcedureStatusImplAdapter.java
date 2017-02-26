package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ProcedureStatus;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ProcedureStatusList;
	
	
	
	

public class ProcedureStatusImplAdapter extends XmlAdapter<String, ProcedureStatus> {

	@Override
	public ProcedureStatus unmarshal(String v) throws Exception {
		ProcedureStatus result = FhirFactory.eINSTANCE.createProcedureStatus();
		result.setValue(ProcedureStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(ProcedureStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
