package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionRelationshipType;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionRelationshipTypeRefElement")
public class ActionRelationshipTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionRelationshipType createInstance() {
		return FhirFactory.eINSTANCE.createActionRelationshipType();
	}
	
	public static ActionRelationshipTypeRef valueOf(String id) {
		ActionRelationshipTypeRef result = new ActionRelationshipTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}