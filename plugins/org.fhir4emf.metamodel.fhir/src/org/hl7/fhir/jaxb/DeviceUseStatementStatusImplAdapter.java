package org.hl7.fhir.jaxb;

import org.hl7.fhir.DeviceUseStatementStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.DeviceUseStatementStatusList;
	
	
	
	

public class DeviceUseStatementStatusImplAdapter extends XmlAdapter<String, DeviceUseStatementStatus> {

	@Override
	public DeviceUseStatementStatus unmarshal(String v) throws Exception {
		DeviceUseStatementStatus result = FhirFactory.eINSTANCE.createDeviceUseStatementStatus();
		result.setValue(DeviceUseStatementStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(DeviceUseStatementStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
