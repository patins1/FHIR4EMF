package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionSelectionBehavior;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionSelectionBehaviorRefElement")
public class ActionSelectionBehaviorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionSelectionBehavior createInstance() {
		return FhirFactory.eINSTANCE.createActionSelectionBehavior();
	}
	
	public static ActionSelectionBehaviorRef valueOf(String id) {
		ActionSelectionBehaviorRef result = new ActionSelectionBehaviorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}