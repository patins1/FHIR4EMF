package org.hl7.fhir.jaxb;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GroupType;

import javax.xml.bind.annotation.adapters.XmlAdapter;
	
import org.hl7.fhir.GroupTypeList;
	
	
	
	

public class GroupTypeImplAdapter extends XmlAdapter<String, GroupType> {

	@Override
	public GroupType unmarshal(String v) throws Exception {
		GroupType result = FhirFactory.eINSTANCE.createGroupType();
		result.setValue(GroupTypeList.get(v));
		return result;
	}

	@Override
	public String marshal(GroupType v) throws Exception {
		return v.getValue().getLiteral();
	}

}
