package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GroupType;

@XmlRootElement(name = "GroupTypeRefElement")
public class GroupTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GroupType createInstance() {
		return FhirFactory.eINSTANCE.createGroupType();
	}
	
	public static GroupTypeRef valueOf(String id) {
		GroupTypeRef result = new GroupTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}