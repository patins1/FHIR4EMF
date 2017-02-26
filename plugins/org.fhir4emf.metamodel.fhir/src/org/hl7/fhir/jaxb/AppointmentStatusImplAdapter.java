package org.hl7.fhir.jaxb;

import org.hl7.fhir.AppointmentStatus;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.AppointmentStatusList;
	
	
	
	

public class AppointmentStatusImplAdapter extends XmlAdapter<String, AppointmentStatus> {

	@Override
	public AppointmentStatus unmarshal(String v) throws Exception {
		AppointmentStatus result = FhirFactory.eINSTANCE.createAppointmentStatus();
		result.setValue(AppointmentStatusList.get(v));
		return result;
	}

	@Override
	public String marshal(AppointmentStatus v) throws Exception {
		return v.getValue().getLiteral();
	}

}
