package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.SystemVersionProcessingMode;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.SystemVersionProcessingModeList;
	
	
	
	

public class SystemVersionProcessingModeImplAdapter extends XmlAdapter<String, SystemVersionProcessingMode> {

	@Override
	public SystemVersionProcessingMode unmarshal(String v) throws Exception {
		SystemVersionProcessingMode result = FhirFactory.eINSTANCE.createSystemVersionProcessingMode();
		result.setValue(SystemVersionProcessingModeList.get(v));
		return result;
	}

	@Override
	public String marshal(SystemVersionProcessingMode v) throws Exception {
		return v.getValue().getLiteral();
	}

}
