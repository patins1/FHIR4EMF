package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.Group;

@XmlRootElement(name = "GroupRefElement")
public class GroupRef extends org.hl7.fhir.jaxb.DomainResourceRef  {

	

	
	@Override
	public Group createInstance() {
		return FhirFactory.eINSTANCE.createGroup();
	}
	
	public static GroupRef valueOf(String id) {
		GroupRef result = new GroupRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}