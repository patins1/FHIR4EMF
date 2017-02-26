package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionPrecheckBehavior;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionPrecheckBehaviorRefElement")
public class ActionPrecheckBehaviorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionPrecheckBehavior createInstance() {
		return FhirFactory.eINSTANCE.createActionPrecheckBehavior();
	}
	
	public static ActionPrecheckBehaviorRef valueOf(String id) {
		ActionPrecheckBehaviorRef result = new ActionPrecheckBehaviorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}