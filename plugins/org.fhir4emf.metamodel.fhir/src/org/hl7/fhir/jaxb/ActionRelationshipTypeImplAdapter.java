package org.hl7.fhir.jaxb;

import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.FhirFactory;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.ActionRelationshipTypeList;
	
	
	
	

public class ActionRelationshipTypeImplAdapter extends XmlAdapter<String, ActionRelationshipType> {

	@Override
	public ActionRelationshipType unmarshal(String v) throws Exception {
		ActionRelationshipType result = FhirFactory.eINSTANCE.createActionRelationshipType();
		result.setValue(ActionRelationshipTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(ActionRelationshipType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
