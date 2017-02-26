package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionList;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionListRefElement")
public class ActionListRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionList createInstance() {
		return FhirFactory.eINSTANCE.createActionList();
	}
	
	public static ActionListRef valueOf(String id) {
		ActionListRef result = new ActionListRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}