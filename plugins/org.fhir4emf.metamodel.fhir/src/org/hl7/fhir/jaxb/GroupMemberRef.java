package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GroupMember;

@XmlRootElement(name = "GroupMemberRefElement")
public class GroupMemberRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GroupMember createInstance() {
		return FhirFactory.eINSTANCE.createGroupMember();
	}
	
	public static GroupMemberRef valueOf(String id) {
		GroupMemberRef result = new GroupMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}