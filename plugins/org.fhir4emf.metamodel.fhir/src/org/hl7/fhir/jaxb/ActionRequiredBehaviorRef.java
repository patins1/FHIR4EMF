package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.ActionRequiredBehavior;
import org.hl7.fhir.FhirFactory;

@XmlRootElement(name = "ActionRequiredBehaviorRefElement")
public class ActionRequiredBehaviorRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public ActionRequiredBehavior createInstance() {
		return FhirFactory.eINSTANCE.createActionRequiredBehavior();
	}
	
	public static ActionRequiredBehaviorRef valueOf(String id) {
		ActionRequiredBehaviorRef result = new ActionRequiredBehaviorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}