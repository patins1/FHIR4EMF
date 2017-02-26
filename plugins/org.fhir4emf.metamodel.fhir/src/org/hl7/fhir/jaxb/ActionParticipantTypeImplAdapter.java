package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionParticipantType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionParticipantTypeList;
	
	
	
	

public class ActionParticipantTypeImplAdapter extends XmlAdapter<String, ActionParticipantType> {

	@Override
	public ActionParticipantType unmarshal(String v) throws Exception {
		ActionParticipantType result = FhirFactory.eINSTANCE.createActionParticipantType();
		result.setValue(ActionParticipantTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionParticipantType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
